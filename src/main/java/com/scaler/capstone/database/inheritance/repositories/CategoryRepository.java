package com.scaler.capstone.database.inheritance.repositories;

import com.scaler.capstone.fakestore.product.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
