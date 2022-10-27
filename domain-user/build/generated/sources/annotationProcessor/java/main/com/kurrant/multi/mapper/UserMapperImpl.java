package com.kurrant.multi.mapper;

import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-27T11:12:20+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User e) {
        if ( e == null ) {
            return null;
        }

        Integer supplierCorpId = null;
        Integer customerCorpId = null;
        Integer type = null;
        Integer level = null;
        Integer locationId = null;
        Integer registerType = null;
        Integer gender = null;
        Integer verifyStatus = null;
        Integer status = null;
        Integer box = null;

        supplierCorpId = e.getSupplierCorpId();
        customerCorpId = e.getCustomerCorpId();
        type = e.getType();
        level = e.getLevel();
        locationId = e.getLocationId();
        registerType = e.getRegisterType();
        gender = e.getGender();
        verifyStatus = e.getVerifyStatus();
        status = e.getStatus();
        box = e.getBox();

        UserDto userDto = new UserDto( supplierCorpId, customerCorpId, type, level, locationId, registerType, gender, verifyStatus, status, box );

        return userDto;
    }

    @Override
    public User toEntity(UserDto d) {
        if ( d == null ) {
            return null;
        }

        User user = new User();

        return user;
    }

    @Override
    public void updateFromDto(UserDto dto, User entity) {
        if ( dto == null ) {
            return;
        }
    }
}
