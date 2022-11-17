package com.kurrant.multi.controller;

import com.kurrant.multi.ResponseMessage;
import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import com.kurrant.multi.mail.EmailService;
import com.kurrant.multi.repository.UserQuerydslRepository;
import com.kurrant.multi.service.UserServiceImpl;
import com.kurrant.multi.sms.MessageDto;
import com.kurrant.multi.sms.SmsResponseDto;
import com.kurrant.multi.sms.SmsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserQuerydslRepository userQuerydslRepository;
    private final UserServiceImpl userService;
    private final EmailService emailService;
    private final SmsService smsService;

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

    @PostMapping("/v1/auth/certification/email")
    public String mailConfirm(@RequestBody User.CheckEmail email) throws Exception {
        return emailService.sendSimpleMessage(email.getEmail());
    }

    @PostMapping("/v1/auth/certification/email/check")
    public String checkEmailCertificationNumber(@RequestBody User.CertificationNumber key) throws Exception {
        return emailService.verifyEmail(key.getNumber());
    }

    @PostMapping("/v1/auth/certification/phone")
    public SmsResponseDto smsConfirm(@RequestBody MessageDto messageDto) throws Exception {
        return smsService.sendSms(messageDto);
    }

    @PostMapping("/v1/auth/certification/phone/check")
    public String checkSmsCertificationNumber(@RequestBody User.CertificationNumber key) throws Exception {
        return smsService.verifySms(key.getNumber());
    }
}
