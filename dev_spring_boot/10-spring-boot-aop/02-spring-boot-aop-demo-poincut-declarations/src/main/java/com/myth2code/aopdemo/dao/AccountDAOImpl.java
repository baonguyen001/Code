package com.myth2code.aopdemo.dao;

import com.myth2code.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public void addAccount(Account account) {
        System.out.println(getClass() + ": DO WORK DB ACCOUT: ADD ACCOUNT");
    }
}
