package com.scaler.capstone.product.controller;

import com.scaler.capstone.product.dto.FakeStoreProductDto;
import com.scaler.capstone.product.models.Product;
import com.scaler.capstone.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService; int a =1/0;
    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") long id){
        return productService.getSingleProduct(id);
    }

    @PostMapping("/add")
    public FakeStoreProductDto addNewProduct(@RequestBody FakeStoreProductDto product){

        return productService.addNewProduct(product);
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") long id, @RequestBody Product product){
        // Patch is to change something in existing data
        return new Product();
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") long id, @RequestBody Product product){
        // put is used replace whole existing data with new data
        return new Product();
    }
}
