package com.kurrant.multi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
public class Address {
    private String address1;
    private String address2;
    private String zipcode;
    private double latitude;
    private double longitude;

    @Builder
    public Address(String address1, String address2, String zipcode, double latitude, double longitude) {
        this.address1 = address1;
        this.address2 = address2;
        this.zipcode = zipcode;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
