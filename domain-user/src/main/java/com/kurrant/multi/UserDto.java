package com.kurrant.multi;

import javax.persistence.Column;
import java.time.Instant;

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

    public Instant created;

    public Integer box;
}
