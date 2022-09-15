package com.toy.jpastudy1.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDERS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order extends BaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING) // ORDINAL를 쓰게 되면 순서가 꼬일 가능성이 있음
    private OrderStatus status;

    @OneToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    public void addOrderItem(OrderItem orderItem) { // 매핑 편의 메소드
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
}
