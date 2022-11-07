package com.kurrant.multi.service;

import com.kurrant.multi.JwtTokenDto;
import com.kurrant.multi.JwtTokenProvider;
import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import com.kurrant.multi.mapper.UserMapper;
import com.kurrant.multi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final JwtTokenProvider jwtTokenProvider;


    @Override
    public JwtTokenDto login(User.Login requestLogin) {
        // 1. 로그인 ID와 Password 기반으로 AuthenticationToken 생성
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(requestLogin.getName(), requestLogin.getPassword());

        // 2. 비밀번호 체크가 이루어지는 부분
        //    authenticate 메서드가 실행될 때 CustomAuthenticationProvider 실행
        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);

        // 3. 인증 정보를 기반으로 JWT 토큰 생성
        JwtTokenDto jwtTokenDto = jwtTokenProvider.generateAccessToken(authentication);

        return jwtTokenDto;
    }

    @Override
    public void join(UserDto userDto) {
        User user = UserMapper.INSTANCE.toEntity(userDto);
        userRepository.save(user);
    }
}
