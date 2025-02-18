package com.scaler.capstone.database.inheritance.repositories;

import com.scaler.capstone.fakestore.product.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
