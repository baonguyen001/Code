package com.myth2code.com.myth.dao;

import com.myth2code.com.myth.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    private EntityManager entityManager;

    public UserDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void createUser(User user) {

        user.registerRole("ROLE_USER");
        entityManager.persist(user);
    }
}
