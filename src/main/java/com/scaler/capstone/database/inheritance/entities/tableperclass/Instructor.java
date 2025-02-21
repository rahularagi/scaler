package com.scaler.capstone.database.inheritance.entities.tableperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_instructor")
public class Instructor extends User {
    @Id
    private Long id;
    private String favouriteStudent;
}
