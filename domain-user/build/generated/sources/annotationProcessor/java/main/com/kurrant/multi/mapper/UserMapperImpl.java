package com.kurrant.multi.mapper;

import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-14T16:01:05+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User e) {
        if ( e == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto = UserDto.builder();

        userDto.name( e.getName() );
        userDto.password( e.getPassword() );
        userDto.role( e.getRole() );

        return userDto.build();
    }

    @Override
    public User toEntity(UserDto d) {
        if ( d == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.name( d.getName() );
        user.password( d.getPassword() );
        user.role( d.getRole() );

        return user.build();
    }

    @Override
    public void updateFromDto(UserDto dto, User entity) {
        if ( dto == null ) {
            return;
        }
    }
}
