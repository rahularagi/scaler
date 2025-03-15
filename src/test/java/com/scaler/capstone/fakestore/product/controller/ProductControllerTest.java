package com.scaler.capstone.fakestore.product.controller;

import com.scaler.capstone.fakestore.product.models.Product;
import com.scaler.capstone.fakestore.product.services.FakeStoreProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {
    @Autowired
    private ProductController productController;
    @MockitoBean
    private FakeStoreProductService productService;
    @Test
    void getAllProducts() {
        //arrange
        List<Product> list= new ArrayList<>();
        Product p1 = new Product();
        p1.setTitle("iPhone 15 Pro");

        Product p2 = new Product();
        p1.setTitle("iPhone 15 Pro max");
        list.add(p1);
        list.add(p2);


        when(
                productService.getAllProducts()
        ).thenReturn(list);

        //act
        ResponseEntity<List<Product>> response = productController.getAllProducts("");

        //assert
        assertEquals(list.size(),response.getBody().size());
    }
}