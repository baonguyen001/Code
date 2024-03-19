package com.myth2code.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{
    @Override
    public void addAccount() {
        System.out.println(getClass() + ": DO WORK DB MEMBER: ADD ACCOUNT");
    }
}
