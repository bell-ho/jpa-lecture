package com.toy.jpastudy1.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Member") // DB에 테이블 이름과 domain이 다르면 @Table 어노테이션에 명시 해주면 됨
public class Member {

    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name") // Table 컬럼명이 다르면 name으로 명시해주면 됨
    private String name;

    private String city;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member") // 양방향 매핑
    private List<Order> orders = new ArrayList<>();
}
