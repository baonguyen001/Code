package com.myth2code.aopdemo.dao;

import com.myth2code.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{

    private String userName;

    private String password;


    @Override
    public void addAccount(Account account) {
        System.out.println(getClass() + ": DO WORK DB ACCOUT: ADD ACCOUNT");
    }


    public String getUserName() {

        System.out.println("Get User Name");
        return userName;
    }

    public void setUserName() {

        System.out.println("Set User Name");
        this.userName = userName;
    }

    public String getPassword() {

        System.out.println("Get Password");
        return password;
    }

    public void setPassword() {

        System.out.println("Set Password");
        this.password = password;
    }
}
