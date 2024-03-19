package com.myth2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyLogToCloudAsync {

    @Before("com.myth2code.aopdemo.aspect.MythAopExpressions.forDaoPackageNotGetSet()")
    public void logToCloudAsync(){
        System.out.println("\n=====> logToCloudAsync");
    }
}
