package com.scaler.capstone.database.inheritance.singleclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DiscriminatorValue(value = "1")
@Entity
public class Mentor extends User {
    private double averageRating;
}
