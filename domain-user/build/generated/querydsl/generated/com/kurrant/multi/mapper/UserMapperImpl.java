package com.kurrant.multi.mapper;

import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-31T17:04:40+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String name = null;
        Integer point = null;

        name = arg0.getName();
        point = arg0.getPoint();

        UserDto userDto = new UserDto( name, point );

        return userDto;
    }

    @Override
    public User toEntity(UserDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.name( arg0.getName() );
        user.point( arg0.getPoint() );

        return user.build();
    }

    @Override
    public void updateFromDto(UserDto arg0, User arg1) {
        if ( arg0 == null ) {
            return;
        }
    }
}
