package com.toy.jpastudy1.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CategoryItem {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
}
