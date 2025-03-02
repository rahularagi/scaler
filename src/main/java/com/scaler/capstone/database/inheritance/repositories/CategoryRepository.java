package com.scaler.capstone.database.inheritance.repositories;


import com.scaler.capstone.database.inheritance.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category getByName(String category);
}
