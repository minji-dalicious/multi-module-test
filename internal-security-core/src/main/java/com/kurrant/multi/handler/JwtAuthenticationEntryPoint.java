package com.kurrant.multi.handler;

import com.kurrant.multi.ErrorCode;
import org.json.JSONObject;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint { //인증 처리 과정에서 예외가 발생한 경우 예외를 핸들링하는 인터페이스
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        // 유효한 자격증명을 제공하지 않고 접근하려 할때 401
        //response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "토큰이 유효하지 않습니다.");

        String exception = (String) request.getAttribute("exception");
        ErrorCode errorCode;

        /**
         * 토큰이 없는 경우 예외처리
         */
        if(exception == null) {
            errorCode = ErrorCode.UNAUTHORIZEDException;
            setResponse(response, errorCode);
            return;
        }

        /**
         * 토큰이 만료된 경우 예외처리
         */
        if(exception.equals("ExpiredJwtException")) {
            errorCode = ErrorCode.ExpiredJwtException;
            setResponse(response, errorCode);
            return;
        }
    }
    private void setResponse(HttpServletResponse response, ErrorCode errorCode) throws IOException {
        JSONObject json = new JSONObject();
        response.setContentType("application/json;charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

        json.put("code", errorCode.getCode());
        json.put("message", errorCode.getMessage());
        response.getWriter().print(json);
    }
}
