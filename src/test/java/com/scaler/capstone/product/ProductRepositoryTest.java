package com.scaler.capstone.product;

import com.scaler.capstone.database.inheritance.repositories.ProductRepository;
import com.scaler.capstone.database.inheritance.repositories.projections.ProductWithIdAndTitle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProductRepositoryTest {
    ProductRepository productRepository;

    @Autowired
    public ProductRepositoryTest(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Test
    void testQuery(){
        List<ProductWithIdAndTitle> products = productRepository.getProductIdAndTitle();
        for(ProductWithIdAndTitle product : products){
            System.out.println(product.getId());
            System.out.println(product.getTitle());
        }
    }
}
