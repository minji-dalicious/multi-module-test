package com.kurrant.multi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests(e -> e
                        .anyRequest().authenticated())
                .formLogin()
//                .loginPage("/user/login") // 로그인 View 제공 (GET /user/login)
                .loginProcessingUrl("/user/login") // 로그인 처리 (POST /user/login)
                .defaultSuccessUrl("/") // 로그인 처리 후 성공 시 URL
                .failureUrl("/user/login?error") // 로그인 처리 후 실패 시 URL
                .and() // [로그아웃 기능]
                .logout()
                .deleteCookies("JSESSIONID", "Email", "PWD")
                .logoutUrl("/user/logout") // 로그아웃 요청 처리 URL
                .and()
                .exceptionHandling();
        return http.build();
    }
}
