package com.kurrant.multi.controller;


import com.kurrant.multi.domain.CustomerCorp;
import com.kurrant.multi.domain.User;
import com.kurrant.multi.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/test")
    public List<CustomerCorp> test() {
        return testService.test();
    }

    @GetMapping("/userTest")
    public User testUser() {
        return testService.testUser();
    }
}
