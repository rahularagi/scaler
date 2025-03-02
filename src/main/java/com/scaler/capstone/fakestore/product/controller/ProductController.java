package com.scaler.capstone.fakestore.product.controller;

import com.scaler.capstone.fakestore.product.dto.FakeStoreProductDto;
import com.scaler.capstone.fakestore.product.models.Product;
import com.scaler.capstone.fakestore.product.services.FakeFetchProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private FakeFetchProductService fakeFetchProductService;
    @Autowired
    public ProductController(@Qualifier("fakeStoreProductService") FakeFetchProductService fakeFetchProductService){
        this.fakeFetchProductService = fakeFetchProductService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(fakeFetchProductService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") long id){
        return fakeFetchProductService.getSingleProduct(id);
    }

    @PostMapping("/add")
    public FakeStoreProductDto addNewProduct(@RequestBody FakeStoreProductDto product){

        return fakeFetchProductService.addNewProduct(product);
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
