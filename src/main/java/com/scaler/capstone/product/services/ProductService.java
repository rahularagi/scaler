package com.scaler.capstone.product.services;

import com.scaler.capstone.product.dto.FakeStoreProductDto;
import com.scaler.capstone.product.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long id);

    FakeStoreProductDto addNewProduct(FakeStoreProductDto product);

    List<Product> getAllProducts();
}
