package com.toy.jpastudy1.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.*;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<CategoryItem> categoryItems = new ArrayList<>();
}
