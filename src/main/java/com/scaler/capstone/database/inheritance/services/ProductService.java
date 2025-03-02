package com.scaler.capstone.database.inheritance.services;



import com.scaler.capstone.database.inheritance.dtos.SelfProductDto;
import com.scaler.capstone.database.inheritance.models.Category;
import com.scaler.capstone.database.inheritance.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long id);

    SelfProductDto addNewProduct(SelfProductDto product);

    List<Product> getAllProducts();

    Category addNewCategory(Category category);
}
