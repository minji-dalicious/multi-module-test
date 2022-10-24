package com.kurrant.multi.mapper;

import com.kurrant.multi.GenericMapper;
import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends GenericMapper<UserDto, User> {
}
