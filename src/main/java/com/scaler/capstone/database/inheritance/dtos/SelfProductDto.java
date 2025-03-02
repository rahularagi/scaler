package com.scaler.capstone.database.inheritance.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SelfProductDto {
    private Long id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
