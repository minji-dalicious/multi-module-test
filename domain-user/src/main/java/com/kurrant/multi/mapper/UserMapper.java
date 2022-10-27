package com.kurrant.multi.mapper;

import com.kurrant.multi.GenericMapper;
import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper extends GenericMapper<UserDto, User> {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
}
