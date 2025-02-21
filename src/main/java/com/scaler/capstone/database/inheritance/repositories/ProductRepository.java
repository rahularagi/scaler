package com.scaler.capstone.database.inheritance.repositories;

import com.scaler.capstone.fakestore.product.models.Category;
import com.scaler.capstone.fakestore.product.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

//    List<Product> findTitleContaining(String word);
//    long deleteByTitleIgnoreCase(String title);
//    List<Product> findByTitleAndDescription(String title,String description);
//    List<Product> findByPriceBetween(double startRange, double endRange);
//    List<Product> findByCategory(Category category);
//    Product findByIdAndCategory(Long id,Category category);
//    Product findByIdAndCategoryOrderByTitle(Long id,Category category);
//    List<Product> findByCategory_Id(Long id);
    Product save(Product product);

}
