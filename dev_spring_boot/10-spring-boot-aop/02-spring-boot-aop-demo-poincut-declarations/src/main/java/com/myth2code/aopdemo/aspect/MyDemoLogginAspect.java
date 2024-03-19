package com.myth2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLogginAspect {

//    @Before("execution(public void com.myth2code.aopdemo.dao.AccountDAO.addAccount())")
//    @Before("execution(public void add*())")
//    @Before("execution(* add*())")

    @Before("execution(* add*(com.myth2code.aopdemo.Account))")
    public void beforeAddAccountAdvice(){
        System.out.println("\n=====> Excuting @Before advice on addAccount()");
    }

}
