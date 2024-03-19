package com.myth2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MythAopExpressions {

    // **** Types ***** \\
//    @Before("execution(public void com.myth2code.aopdemo.dao.AccountDAO.addAccount())")
//    @Before("execution(public void add*())")
//    @Before("execution(* add*())")
//    @Pointcut("execution(* com.myth2code.aopdemo.dao.*.*(..))")
//    kết hợp các Pointcut
//    thứ tự Pointcut @Order


    @Pointcut("execution(* com.myth2code.aopdemo.dao.*.*(..))")
    public void forDaoPackage(){}

    // create pointcut getter
    @Pointcut("execution(* com.myth2code.aopdemo.dao.*.get*(..))")
    public void getter(){}

    // create pointcut setter
    @Pointcut("execution(* com.myth2code.aopdemo.dao.*.set*(..))")
    public void setter(){}

    // create pointcut: kết hợp get/set
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNotGetSet(){}
}
