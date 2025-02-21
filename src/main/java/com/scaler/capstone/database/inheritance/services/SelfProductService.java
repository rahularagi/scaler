package com.scaler.capstone.database.inheritance.services;

import com.scaler.capstone.database.inheritance.repositories.CategoryRepository;
import com.scaler.capstone.database.inheritance.repositories.ProductRepository;
import com.scaler.capstone.fakestore.product.dto.FakeStoreProductDto;
import com.scaler.capstone.fakestore.product.models.Category;
import com.scaler.capstone.fakestore.product.models.Product;
import com.scaler.capstone.fakestore.product.services.ProductService;
import jakarta.persistence.ManyToOne;
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
        Category category = categoryRepository.getByName(product.getCategory());
        Product productEntity = new Product();
        productEntity.setTitle(product.getTitle());
        productEntity.setPrice(product.getPrice());
        productEntity.setCategory(category);
        productEntity.setDescription(product.getDescription());
        productEntity.setImageUrl(productEntity.getImageUrl());

        Product productResponse = productRepository.save(productEntity);
        FakeStoreProductDto response =new FakeStoreProductDto();
        response.setId(productResponse.getId());
        response.setTitle(productResponse.getTitle());
        response.setCategory(productResponse.getCategory().getName());
        response.setPrice(productResponse.getPrice());
        response.setDescription(productResponse.getDescription());
        response.setImage(productResponse.getImageUrl());
        return response;
    }

    public Category addNewCategory(Category category){
        return categoryRepository.save(category);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
