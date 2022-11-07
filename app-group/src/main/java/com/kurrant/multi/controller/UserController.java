package com.kurrant.multi.controller;

import com.kurrant.multi.ResponseMessage;
import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import com.kurrant.multi.repository.UserQuerydslRepository;
import com.kurrant.multi.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserQuerydslRepository userQuerydslRepository;
    private final UserServiceImpl userService;

    @GetMapping("/users/same-name")
    public List<UserDto> getUsersWithSameName() {
        return userQuerydslRepository.findByUsername("테스트");
    }

    @PostMapping("/v1/auth/login")
    public ResponseMessage login(@RequestBody User.Login requestLogin) {
        return ResponseMessage.builder()
                .result(true)
                .message("로그인에 성공하였습니다.")
                .data(userService.login(requestLogin))
                .build();
    }

    @PostMapping("/v1/auth/join")
    public ResponseMessage join(@RequestBody UserDto userDto) {
        userService.join(userDto);
        return ResponseMessage.builder()
                .result(true)
                .message("일반 회원가입에 성공하였습니다.")
                .build();
    }
}
