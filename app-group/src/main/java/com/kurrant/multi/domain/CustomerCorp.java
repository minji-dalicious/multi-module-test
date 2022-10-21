package com.kurrant.multi.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="CustomerCorp")
public class CustomerCorp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKey", nullable = false)
    private Integer id;

    @Column(name = "Parent", nullable = false)
    private Integer parent;

    @Column(name = "LocationId", nullable = false)
    private Integer locationId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Phone", nullable = false, length = 20)
    private String phone;

    @Column(name = "Code", length = 10)
    private String code;

    @Column(name = "Created", nullable = false)
    private Instant created;

    @Column(name = "Updated")
    private Instant updated;

    @Column(name = "isPublic", nullable = false)
    private Integer isPublic;

    @Column(name = "isExposed", nullable = false)
    private Integer isExposed;

    @Column(name = "TotalNum")
    private Integer totalNum;

    @Column(name = "isGarbage")
    private Integer isGarbage;

    @Column(name = "isWarmbox")
    private Integer isWarmbox;

    @Column(name = "PreferStyle")
    private Integer preferStyle;

    @Column(name = "AllowDeliveryFee", nullable = false)
    private Integer allowDeliveryFee;

    @Column(name = "isApt", nullable = false)
    private Integer isApt;

    @Column(name = "isMembership", nullable = false)
    private Integer isMembership;

    @Column(name = "OrderCode", length = 10)
    private String orderCode;

    @Column(name = "isSalad", nullable = false)
    private Boolean isSalad = false;

    @Column(name = "CreationCycle", nullable = false)
    private Boolean creationCycle = false;

    @Column(name = "AddressOption", nullable = false)
    private Boolean addressOption = false;

    @Column(name = "isCustom", nullable = false)
    private Boolean isCustom = false;

    @Column(name = "CustomPrice")
    private Integer customPrice;

    @Column(name = "CustomTotalNum")
    private Integer customTotalNum;

    @Column(name = "CustomerGroupId")
    private Integer customerGroupId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public Instant getUpdated() {
        return updated;
    }

    public void setUpdated(Instant updated) {
        this.updated = updated;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public Integer getIsExposed() {
        return isExposed;
    }

    public void setIsExposed(Integer isExposed) {
        this.isExposed = isExposed;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getIsGarbage() {
        return isGarbage;
    }

    public void setIsGarbage(Integer isGarbage) {
        this.isGarbage = isGarbage;
    }

    public Integer getIsWarmbox() {
        return isWarmbox;
    }

    public void setIsWarmbox(Integer isWarmbox) {
        this.isWarmbox = isWarmbox;
    }

    public Integer getPreferStyle() {
        return preferStyle;
    }

    public void setPreferStyle(Integer preferStyle) {
        this.preferStyle = preferStyle;
    }

    public Integer getAllowDeliveryFee() {
        return allowDeliveryFee;
    }

    public void setAllowDeliveryFee(Integer allowDeliveryFee) {
        this.allowDeliveryFee = allowDeliveryFee;
    }

    public Integer getIsApt() {
        return isApt;
    }

    public void setIsApt(Integer isApt) {
        this.isApt = isApt;
    }

    public Integer getIsMembership() {
        return isMembership;
    }

    public void setIsMembership(Integer isMembership) {
        this.isMembership = isMembership;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Boolean getIsSalad() {
        return isSalad;
    }

    public void setIsSalad(Boolean isSalad) {
        this.isSalad = isSalad;
    }

    public Boolean getCreationCycle() {
        return creationCycle;
    }

    public void setCreationCycle(Boolean creationCycle) {
        this.creationCycle = creationCycle;
    }

    public Boolean getAddressOption() {
        return addressOption;
    }

    public void setAddressOption(Boolean addressOption) {
        this.addressOption = addressOption;
    }

    public Boolean getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
    }

    public Integer getCustomPrice() {
        return customPrice;
    }

    public void setCustomPrice(Integer customPrice) {
        this.customPrice = customPrice;
    }

    public Integer getCustomTotalNum() {
        return customTotalNum;
    }

    public void setCustomTotalNum(Integer customTotalNum) {
        this.customTotalNum = customTotalNum;
    }

    public Integer getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

}