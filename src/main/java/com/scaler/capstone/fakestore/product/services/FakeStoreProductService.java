package com.scaler.capstone.fakestore.product.services;

import com.scaler.capstone.fakestore.product.dto.FakeStoreProductDto;
import com.scaler.capstone.fakestore.product.models.Category;
import com.scaler.capstone.fakestore.product.models.Product;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Log4j2
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;

    @Autowired
    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    //ToDo : Need to implement all other 7 APIs of fake store    16 oct, 23 oct, 25 oct
    @Override
    public Product getSingleProduct(Long id) {
        try {
            FakeStoreProductDto response = restTemplate.getForObject(
                    "https://fakestoreapi.com/products/" + id,
                    FakeStoreProductDto.class);

            return convertFakeStoreToProduct(response);
        }catch (Exception e){
            log.error("Some Exception occurred",e);
            return null;
        }
    }

    @Override
    public FakeStoreProductDto addNewProduct(FakeStoreProductDto product) {
        try {
            FakeStoreProductDto response = restTemplate.postForObject("https://fakestoreapi.com/products", product, FakeStoreProductDto.class);
            return response;
        }catch (Exception e){
            log.error("Some Exception occurred",e);
            return null;
        }
    }

    @Override
    public List<Product> getAllProducts() {
//        try {
            //Todo Need add Product [].Class instead List.Class
            List<Product> productList = restTemplate.getForObject("https://fakestoreapi.com/products", List.class);
            return productList;
//        }catch (Exception e){
//            log.error("Some Exception occurred",e);
//            return null;
//        }
    }

    @Override
    public Category addNewCategory(Category category) {
        return null;
    }

    private Product convertFakeStoreToProduct(FakeStoreProductDto fakeStoreProductDto ) {
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setCategory(new Category());
        product.getCategory().setName(fakeStoreProductDto.getCategory());
        product.setImageUrl(fakeStoreProductDto.getImage());
        return product;
    }

}
