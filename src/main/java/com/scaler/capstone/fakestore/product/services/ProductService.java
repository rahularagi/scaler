package com.scaler.capstone.fakestore.product.services;

import com.scaler.capstone.fakestore.product.dto.FakeStoreProductDto;
import com.scaler.capstone.fakestore.product.models.Category;
import com.scaler.capstone.fakestore.product.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long id);

    FakeStoreProductDto addNewProduct(FakeStoreProductDto product);

    List<Product> getAllProducts();

    Category addNewCategory(Category category);
}
