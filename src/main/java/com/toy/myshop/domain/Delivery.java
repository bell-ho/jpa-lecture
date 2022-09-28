package com.toy.myshop.domain;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Data
public class Delivery extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private DeliveryStatus status;

    @Embedded
    private Address address;


    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;
}
