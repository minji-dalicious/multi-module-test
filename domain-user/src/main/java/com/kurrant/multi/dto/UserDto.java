package com.kurrant.multi.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserDto {

    private String name;
    private String password;
    private Integer point;

    @Builder
    public UserDto(String name, String password, Integer point) {
        this.name = name;
        this.password = password;
        this.point = point;
    }
}
