package com.kurrant.multi.mapper;

import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-14T16:01:24+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User arg0) {
        if ( arg0 == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto = UserDto.builder();

        userDto.name( arg0.getName() );
        userDto.password( arg0.getPassword() );
        userDto.role( arg0.getRole() );

        return userDto.build();
    }

    @Override
    public User toEntity(UserDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.name( arg0.getName() );
        user.password( arg0.getPassword() );
        user.role( arg0.getRole() );

        return user.build();
    }

    @Override
    public void updateFromDto(UserDto arg0, User arg1) {
        if ( arg0 == null ) {
            return;
        }
    }
}
