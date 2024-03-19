package com.myth2code.example.microservice.controller;

import com.myth2code.example.microservice.entity.User;
import com.myth2code.example.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    //http://localhost:8080/api/user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User saveUser = userService.createUser(user);
        return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
    }

    //http://localhost:8080/api/user/{id}
    @GetMapping("{id}")
    public ResponseEntity<User> findUser(@PathVariable int id){

        User user = userService.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    //http://localhost:8080/api/user
    @GetMapping
    public ResponseEntity<List<User>> findAllUser(){

        List<User> listUser = userService.getAllUser();

        return new ResponseEntity<>(listUser, HttpStatus.OK);
    }


}
