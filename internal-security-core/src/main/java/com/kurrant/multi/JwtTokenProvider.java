package com.kurrant.multi;

import com.kurrant.multi.domain.Role;
import com.kurrant.multi.domain.User;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import java.security.Key;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@Slf4j
@Component
public class JwtTokenProvider {
    private static final int SEC = 1;
    private static final int MINUTE = 60 * SEC;
    private static final int HOUR = 60 * MINUTE;
    private static final int DAY = 24 * HOUR;

    //access token 유효기간 - seconds, milliseconds
    private static final int JWT_ACCESS_TOKEN_VALID_SEC = 30 * MINUTE;
    private static final int JWT_ACCESS_TOKEN_VALID_MILLI_SEC = 1000 * JWT_ACCESS_TOKEN_VALID_SEC;

    //refresh token 유효기간 - seconds, milliseconds
    private static final int JWT_REFRESH_TOKEN_VALID_SEC = 7 * DAY;
    public static final int JWT_REFRESH_TOKEN_VALID_MILLI_SEC = 1000 * JWT_REFRESH_TOKEN_VALID_SEC;
    private static final String AUTHORITIES_KEY = "auth";
    public static final String TOKEN_TYPE = "Bearer";

    @Value("${jwt.secret}")
    public static String JWT_SECRET;

    @Value("${jwt.issuer}")
    public static String JWT_ISSUER;

    private static Key key;

    public JwtTokenProvider(@Value("${jwt.secret}") String secretKey) {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        key = Keys.hmacShaKeyFor(keyBytes);
    }

    public JwtTokenDto generateAccessToken(Authentication authentication) {
        String authority = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(","));

        //accessToken 생성
        Date accessTokenExpiresIn = new Date(System.currentTimeMillis() + JWT_ACCESS_TOKEN_VALID_MILLI_SEC);
        String accessToken = Jwts.builder()
                .setSubject(authentication.getName())       // payload "sub": "name"
                .claim(AUTHORITIES_KEY, authority)          // payload "auth": "ROLE_USER"
                .setExpiration(accessTokenExpiresIn)        // payload "exp": 1516239022 (예시)
                .signWith(key, SignatureAlgorithm.HS512)    // header "alg": "HS512"
                .compact();

        return JwtTokenDto.builder()
                .accessToken(accessToken)
                .build();
    }



    public Authentication getAuthentication(String accessToken){
        Claims claims = parseClaims(accessToken);

        if (claims.get(AUTHORITIES_KEY) == null) {
            throw new IllegalArgumentException("");
        }

        // 클레임에서 권한 정보 가져오기
        Collection<? extends GrantedAuthority> authorities =
                Arrays.stream(claims.get(AUTHORITIES_KEY).toString().split(","))
                        .map(SimpleGrantedAuthority::new)
                        .collect(Collectors.toList());

        // UserDetails 객체를 만들어서 Authentication 리턴
        UserDetailsImpl principal = new UserDetailsImpl(new User(claims.getSubject(), "", Role.USER));

        return new UsernamePasswordAuthenticationToken(principal, "", authorities);
    }

    public boolean validateToken(ServletRequest request, String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (io.jsonwebtoken.security.SecurityException e) {
            log.info("잘못된 JWT 서명입니다.");
            request.setAttribute("exception", "SecurityException");
        } catch (MalformedJwtException e) {
            request.setAttribute("exception", "MalformedJwtException");
        } catch(ExpiredJwtException e) {
            log.info("만료된 JWT 토큰입니다.");
            request.setAttribute("exception", "ExpiredJwtException");
        } catch (UnsupportedJwtException e) {
            log.info("지원되지 않는 JWT 토큰입니다.");
            request.setAttribute("exception", "UnsupportedJwtException");
        } catch (IllegalArgumentException e) {
            log.info("JWT 토큰이 잘못되었습니다.");
            request.setAttribute("exception", "IllegalArgumentException");
        }
        return false;
    }

    public static Claims parseClaims(String accessToken) {
        try {
            return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(accessToken).getBody();
        } catch (ExpiredJwtException e) {
            return e.getClaims();
        }
    }
}
