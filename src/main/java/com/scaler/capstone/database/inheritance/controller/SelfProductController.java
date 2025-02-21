package com.scaler.capstone.database.inheritance.controller;

import com.scaler.capstone.fakestore.product.dto.FakeStoreProductDto;
import com.scaler.capstone.fakestore.product.models.Category;
import com.scaler.capstone.fakestore.product.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/self-product")
public class SelfProductController {

    ProductService productService;

    public SelfProductController(@Qualifier("selfProductService") ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/product")
    public ResponseEntity<FakeStoreProductDto> addNewProduct(@RequestBody FakeStoreProductDto product){
        return new ResponseEntity<>(productService.addNewProduct(product), HttpStatus.OK);
    }

    @PostMapping("/category")
    public ResponseEntity<Category> addNewCategory(@RequestBody Category category){
        return new ResponseEntity<>(productService.addNewCategory(category),HttpStatus.OK);
    }
}
