package com.github.Ciiccillo73.Files.fileManagment.controller;


import com.github.Ciiccillo73.Files.fileManagment.models.User;
import com.github.Ciiccillo73.Files.fileManagment.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
//index route, all users
    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    //show route, show a user by id

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getUSerById(@PathVariable Long id){
        return new ResponseEntity(userRepository.findById(id), HttpStatus.OK);
    }


}
