package com.scaler.capstone.fakestore.product.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private double price;
    @ManyToOne
//    @JoinColumn(name="id")
    private Category category;
    private String description;
    private String imageUrl;
}
