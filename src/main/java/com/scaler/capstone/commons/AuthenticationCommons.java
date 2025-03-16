package com.scaler.capstone.commons;

import com.scaler.capstone.fakestore.product.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthenticationCommons {
    @Autowired
    private RestTemplate restTemplate;
    public AuthenticationCommons(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    public UserDto validateToken(String token){
        ResponseEntity<UserDto> userDtoResponseEntity = restTemplate.postForEntity("http://localhost:8181/users/validate/"+token, null,UserDto.class);
        if(userDtoResponseEntity.getBody() == null){
            return null;
        }
        return userDtoResponseEntity.getBody();
    }
}
