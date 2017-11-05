package com.math;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;
@Component
@Aspect
public class Advice {
    @Pointcut("execution(* com.math.math.*(..))")
    public void performance(){}
    @Before("performance()")
    public void before(JoinPoint jp){
        System.out.println("--------前置通知--------");
        System.out.println(jp.getSignature().getName());
    }
    @After("performance()")
    public void after(JoinPoint jp){

        System.out.println("--------后置通知--------");
    }
}
