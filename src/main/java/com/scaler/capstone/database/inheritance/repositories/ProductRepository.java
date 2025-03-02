package com.scaler.capstone.database.inheritance.repositories;

import com.scaler.capstone.database.inheritance.models.Product;
import com.scaler.capstone.database.inheritance.repositories.projections.ProductWithIdAndTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query(value ="select p from product p")
    List<Product> somethingSomething();
    @Query(value = "select p.id as id, p.title as title from product p")
    List<ProductWithIdAndTitle> getProductIdAndTitle();
    @Query(value = "select * from product",nativeQuery = true)
    List<Product> someSome2();
    @Query(value = "select p.id as id, p.title as title from product p",nativeQuery = true)
    List<ProductWithIdAndTitle> someSome3();
    @Query(value = "select p.id as id, p.title as title from product p where p.id = :id")
    List<ProductWithIdAndTitle> getProductIdAndTitleById(@Param("id")Long id);
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
