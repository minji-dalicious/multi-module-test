package com.kurrant.multi.dto;

import com.kurrant.multi.domain.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserDto {

    private String name;
    private String password;
    private Role role;

    @Builder
    public UserDto(String name, String password, Role role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public void encodePassword(String password) {
        this.password = password;
    }
}
