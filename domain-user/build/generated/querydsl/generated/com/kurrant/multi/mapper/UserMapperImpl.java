package com.kurrant.multi.mapper;

import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-27T13:03:47+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User arg0) {
        if ( arg0 == null ) {
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

        supplierCorpId = arg0.getSupplierCorpId();
        customerCorpId = arg0.getCustomerCorpId();
        type = arg0.getType();
        level = arg0.getLevel();
        locationId = arg0.getLocationId();
        registerType = arg0.getRegisterType();
        gender = arg0.getGender();
        verifyStatus = arg0.getVerifyStatus();
        status = arg0.getStatus();
        box = arg0.getBox();

        UserDto userDto = new UserDto( supplierCorpId, customerCorpId, type, level, locationId, registerType, gender, verifyStatus, status, box );

        return userDto;
    }

    @Override
    public User toEntity(UserDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        User user = new User();

        return user;
    }

    @Override
    public void updateFromDto(UserDto arg0, User arg1) {
        if ( arg0 == null ) {
            return;
        }
    }
}
