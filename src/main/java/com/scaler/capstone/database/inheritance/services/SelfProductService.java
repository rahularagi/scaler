package com.scaler.capstone.database.inheritance.services;

import com.scaler.capstone.database.inheritance.dtos.SelfProductDto;
import com.scaler.capstone.database.inheritance.models.Product;
import com.scaler.capstone.database.inheritance.models.Category;
import com.scaler.capstone.database.inheritance.repositories.CategoryRepository;
import com.scaler.capstone.database.inheritance.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("selfProductService")
public class SelfProductService implements ProductService{
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
    public SelfProductDto addNewProduct(SelfProductDto product) {
        Category category = categoryRepository.getByName(product.getCategory());
        Product productEntity = new Product();
        productEntity.setTitle(product.getTitle());
        productEntity.setPrice(product.getPrice());
        productEntity.setCategory(category);
        productEntity.setDescription(product.getDescription());
        productEntity.setImageUrl(productEntity.getImageUrl());

        Product productResponse = productRepository.save(productEntity);
        SelfProductDto response =new SelfProductDto();
        response.setId(productResponse.getId());
        response.setTitle(productResponse.getTitle());
        response.setCategory(productResponse.getCategory().getName());
        response.setPrice(productResponse.getPrice());
        response.setDescription(productResponse.getDescription());
        response.setImage(productResponse.getImageUrl());
        return response;
    }

    @Override
    public Category addNewCategory(Category category){
        return categoryRepository.save(category);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
