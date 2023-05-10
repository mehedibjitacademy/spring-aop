package com.example.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class DemoAspect {

    @Before("execution(* com.example.springaop.ClassA.printHello (..))")
    public void logBeforePrintHello() {
        System.out.println("Before calling method: printHello()");
    }
    @Before("execution(* com.example.springaop.ClassA.getNum (..))")
    public void logBeforeGetNum() {
        System.out.println("Before calling method: GetNum()");
    }
    @Before("execution(* com.example.springaop.ClassA.getSum (..))")
    public void logBeforeGetSum() {
        System.out.println("Before calling method: getSum()");
    }
}
