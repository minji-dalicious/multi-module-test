package com.kurrant.multi.controller;

import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import com.kurrant.multi.mapper.UserMapper;
import com.kurrant.multi.repository.UserQuerydslRepository;
import com.kurrant.multi.repository.UserRepository;
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
    private final UserRepository userRepository;

    @GetMapping("/users/same-name")
    public List<UserDto> getUsersWithSameName() {
        return userQuerydslRepository.findByUsername("테스트");
    }

    @PostMapping("/user/save")
    public User saveUser(@RequestBody UserDto userDto) {
        User user = UserMapper.INSTANCE.toEntity(userDto);
        return userRepository.save(user);
    }
}
