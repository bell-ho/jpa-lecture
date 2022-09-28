package com.toy.myshop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Member") // DB에 테이블 이름과 domain이 다르면 @Table 어노테이션에 명시 해주면 됨
public class Member extends BaseEntity {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(name = "name") // Table 컬럼명이 다르면 name으로 명시해주면 됨
    private String name;

    @Embedded
    private Period workPeriod;

    @Embedded
    private Address homeAddress;

    @OneToMany(mappedBy = "member") // 양방향 매핑
    private List<Order> orders = new ArrayList<>();

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "locker_id")
    private Locker locker;

    @OneToMany(mappedBy = "member")
    private List<MemberProduct> memberProducts = new ArrayList<>();

}
