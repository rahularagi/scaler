package com.scaler.capstone.database.inheritance.services;

import com.scaler.capstone.database.inheritance.repositories.CategoryRepository;
import com.scaler.capstone.database.inheritance.repositories.ProductRepository;
import com.scaler.capstone.fakestore.product.dto.FakeStoreProductDto;
import com.scaler.capstone.fakestore.product.models.Product;
import com.scaler.capstone.fakestore.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("selfProductService")
public class SelfProductService implements ProductService {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public SelfProductService (ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long id) {
        return null;
    }

    @Override
    public FakeStoreProductDto addNewProduct(FakeStoreProductDto product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
