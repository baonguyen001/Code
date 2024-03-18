package com.myth2code.com.myth.dao;

import com.myth2code.com.myth.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

    void createUser(User user);

}

