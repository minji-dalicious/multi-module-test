package com.kurrant.multi.dto;

import com.kurrant.multi.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {

    private Role role;

    private String name;

    private Integer point;
}
