package com.kurrant.multi;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends GenericMapper<UserDto, User>{
}
