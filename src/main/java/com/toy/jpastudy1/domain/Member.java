package com.toy.jpastudy1.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "Member") // DB에 테이블 이름과 domain이 다르면 @Table 어노테이션에 명시 해주면 됨
public class Member {

    @Id
    private Long id;

    @Column(name = "name") // Table 컬럼명이 다르면 name으로 명시해주면 됨
    private String name;
}
