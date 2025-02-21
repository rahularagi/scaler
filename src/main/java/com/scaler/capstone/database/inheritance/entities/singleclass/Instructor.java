package com.scaler.capstone.database.inheritance.entities.singleclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DiscriminatorValue(value = "2")
@Entity
public class Instructor extends User {
    private String favouriteStudent;
}
