package com.scaler.capstone.product.services;

import com.scaler.capstone.product.dto.FakeStoreProductDto;
import com.scaler.capstone.product.models.Category;
import com.scaler.capstone.product.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;

    @Autowired
    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    //ToDo : Need to implement all other 7 APIs of fake store    16 oct, 23 oct, 25 oct
    @Override
    public Product getSingleProduct(Long id) {
        FakeStoreProductDto response = restTemplate.getForObject(
               "https://fakestoreapi.com/products/"+id,
               FakeStoreProductDto.class);

        return convertFakeStoreToProduct(response);
    }

    @Override
    public FakeStoreProductDto addNewProduct(FakeStoreProductDto product) {
        FakeStoreProductDto response = restTemplate.postForObject("https://fakestoreapi.com/products",product,FakeStoreProductDto.class);
        return response;
    }

    @Override
    public List<Product> getAllProducts() {
        //Todo Need add Product [].Class instead List.Class
        List<Product> productList = restTemplate.getForObject("https://fakestoreapi.com/products", List.class);
        return productList;
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
