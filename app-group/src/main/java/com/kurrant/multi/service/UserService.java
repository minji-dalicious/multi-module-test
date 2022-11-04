package com.kurrant.multi.service;

import com.kurrant.multi.JwtTokenDto;
import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;

public interface UserService {
    JwtTokenDto login(User.Login requestLogin);
    void join(UserDto userDto);
}
