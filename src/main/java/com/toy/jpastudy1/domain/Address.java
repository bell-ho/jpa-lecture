package com.toy.jpastudy1.domain;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
