package com.toy.jpastudy1.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import static javax.persistence.FetchType.LAZY;

@Entity
@Data
public class Locker {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(mappedBy = "locker", fetch = LAZY)
    private Member member;
}
