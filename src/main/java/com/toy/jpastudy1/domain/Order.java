package com.toy.jpastudy1.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.EnumType.*;
import static javax.persistence.FetchType.*;

@Entity
@Table(name = "ORDERS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "order", cascade = ALL)
    private List<OrderItem> orderItems = new ArrayList<>();

    private LocalDateTime orderDate;

    @Enumerated(STRING) // ORDINAL를 쓰게 되면 순서가 꼬일 가능성이 있음
    private OrderStatus status;

    @OneToOne(fetch = LAZY, cascade = ALL)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    public void addOrderItem(OrderItem orderItem) { // 매핑 편의 메소드
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
}
