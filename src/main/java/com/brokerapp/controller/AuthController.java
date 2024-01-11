package com.brokerapp.controller;

import com.brokerapp.payload.UserDto;
import com.brokerapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> createUser(UserDto userDto){
        long userId = userService.createUser(userDto);
        return new ResponseEntity<>("User is created and user id is: " + userId, HttpStatus.CREATED);
    }

}
