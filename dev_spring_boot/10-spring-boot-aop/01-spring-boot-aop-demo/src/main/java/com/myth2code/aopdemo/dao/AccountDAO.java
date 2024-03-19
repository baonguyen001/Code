package com.myth2code.aopdemo.dao;

import com.myth2code.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account account);


    public String getUserName();

    public void setUserName();

    public String getPassword();

    public void setPassword();
}
