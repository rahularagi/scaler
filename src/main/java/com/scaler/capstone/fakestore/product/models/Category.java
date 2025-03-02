package com.scaler.capstone.fakestore.product.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category {
    private Long id;
    private String name;
    private List<Product> products;
}
