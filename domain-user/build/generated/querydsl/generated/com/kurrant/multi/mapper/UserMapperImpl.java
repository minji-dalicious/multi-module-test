package com.kurrant.multi.mapper;

import com.kurrant.multi.domain.Role;
import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-31T09:21:33+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto UserToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        Role role = null;
        String name = null;
        Integer point = null;

        role = user.getRole();
        name = user.getName();
        point = user.getPoint();

        UserDto userDto = new UserDto( role, name, point );

        return userDto;
    }

    @Override
    public User UserDtoToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        return user;
    }
}
