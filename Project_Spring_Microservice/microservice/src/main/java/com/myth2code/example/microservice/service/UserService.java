package com.myth2code.example.microservice.service;

import com.myth2code.example.microservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    User createUser(User user);

    User findUserById(int id);

    List<User> getAllUser();

    User updateUser(User user);


}
