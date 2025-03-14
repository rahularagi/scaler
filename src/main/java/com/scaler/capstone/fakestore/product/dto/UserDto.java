package com.scaler.capstone.fakestore.product.dto;

import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class UserDto {
    private String name;
    private String email;
    private List<Role> roles;
    private boolean isEmailVerified;

}
