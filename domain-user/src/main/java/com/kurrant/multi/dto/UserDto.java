package com.kurrant.multi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
public class UserDto {
    public Integer supplierCorpId;

    public Integer customerCorpId;

    public Integer type;

    public Integer level;

    public Integer locationId;

    public Integer registerType;

    public Integer gender;

    public Integer verifyStatus;

    public Integer status;

//    public LocalDateTime created;

    public Integer box;
}
