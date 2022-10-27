package com.kurrant.multi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKey", nullable = false)
    private Integer id;

    @Column(name = "SupplierCorpId", nullable = false)
    private Integer supplierCorpId;

    @Column(name = "CustomerCorpId", nullable = false)
    private Integer customerCorpId;

    @Column(name = "Type", nullable = false)
    private Integer type;

    @Column(name = "Level", nullable = false)
    private Integer level;

    @Column(name = "LocationId", nullable = false)
    private Integer locationId;

    @Column(name = "Id", length = 100)
    private String id1;

    @Column(name = "PWD", length = 100)
    private String pwd;

    @Column(name = "Email")
    private String email;

    @Column(name = "Name", length = 50)
    private String name;

    @Column(name = "SnsKey")
    private String snsKey;

    @Column(name = "RegisterType", nullable = false)
    private Integer registerType;

    @Column(name = "Birth")
    private Instant birth;

    @Column(name = "Phone", length = 20)
    private String phone;

    @Column(name = "Gender", nullable = false)
    private Integer gender;

    @Column(name = "VerifyNum", length = 10)
    private String verifyNum;

    @Column(name = "VerifyStatus", nullable = false)
    private Integer verifyStatus;

    @Column(name = "Status", nullable = false)
    private Integer status;

    @Column(name = "isAcceptMarketing")
    private Integer isAcceptMarketing;

    @Column(name = "isAcceptTerms")
    private Integer isAcceptTerms;

    @Column(name = "isWework")
    private Integer isWework;

    @Column(name = "Registered")
    private Instant registered;

    @Column(name = "RequestVerifying")
    private Instant requestVerifying;

    @Column(name = "SucceedVerifying")
    private Instant succeedVerifying;

    @Column(name = "OS")
    private Integer os;

    @Column(name = "OSver", length = 20)
    private String oSver;

    @Column(name = "UDID", length = 200)
    private String udid;

    @Column(name = "Created", nullable = false)
    private Instant created;

    @Column(name = "Updated")
    private Instant updated;

    @Column(name = "MarketingDate")
    private Instant marketingDate;

    @Column(name = "FCMToken", length = 200)
    private String fCMToken;

    @Column(name = "Box", nullable = false)
    private Integer box;

    @Builder
    public User(Integer id, Integer supplierCorpId, Integer customerCorpId, Integer type, Integer level, Integer locationId, String id1, String pwd, String email, String name, String snsKey, Integer registerType, Instant birth, String phone, Integer gender, String verifyNum, Integer verifyStatus, Integer status, Integer isAcceptMarketing, Integer isAcceptTerms, Integer isWework, Instant registered, Instant requestVerifying, Instant succeedVerifying, Integer os, String oSver, String udid, Instant created, Instant updated, Instant marketingDate, String fCMToken, Integer box) {
        this.id = id;
        this.supplierCorpId = supplierCorpId;
        this.customerCorpId = customerCorpId;
        this.type = type;
        this.level = level;
        this.locationId = locationId;
        this.id1 = id1;
        this.pwd = pwd;
        this.email = email;
        this.name = name;
        this.snsKey = snsKey;
        this.registerType = registerType;
        this.birth = birth;
        this.phone = phone;
        this.gender = gender;
        this.verifyNum = verifyNum;
        this.verifyStatus = verifyStatus;
        this.status = status;
        this.isAcceptMarketing = isAcceptMarketing;
        this.isAcceptTerms = isAcceptTerms;
        this.isWework = isWework;
        this.registered = registered;
        this.requestVerifying = requestVerifying;
        this.succeedVerifying = succeedVerifying;
        this.os = os;
        this.oSver = oSver;
        this.udid = udid;
        this.created = created;
        this.updated = updated;
        this.marketingDate = marketingDate;
        this.fCMToken = fCMToken;
        this.box = box;
    }
}