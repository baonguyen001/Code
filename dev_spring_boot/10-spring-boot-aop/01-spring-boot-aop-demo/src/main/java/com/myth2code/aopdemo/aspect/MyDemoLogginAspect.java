package com.myth2code.aopdemo.aspect;

import com.myth2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLogginAspect {

    @Before("com.myth2code.aopdemo.aspect.MythAopExpressions.forDaoPackageNotGetSet()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint){
        System.out.println("\n=====> beforeAddAccountAdvice");

        // Display method signature
        MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();
        System.out.println("Method: " + methodSignature);

        // Display method argument

        // Get args
        Object[] args = theJoinPoint.getArgs();

        // loop thru args
        for(Object tempArgs : args){

            if(tempArgs instanceof Account){

                Account theAccount = (Account) tempArgs;

                System.out.println("Account First Name: " + theAccount.getFirstName());
                System.out.println("Account Last Name: " + theAccount.getLastName() + "\n");

            }

        }


    }

}
