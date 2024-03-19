package com.myth2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyApiAnalyticAdvice {

    @Before("com.myth2code.aopdemo.aspect.MythAopExpressions.forDaoPackageNotGetSet()")
    public void performApiAnalyticsAdvice(){
        System.out.println("\n=====> performApiAnalyticsAdvice");
    }
}
