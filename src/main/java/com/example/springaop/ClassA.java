package com.example.springaop;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class ClassA {
    public void printHello(){
        System.out.println("Hello");
    }
    int getNum(){
        System.out.println("getNum() method called");
        return new Random().nextInt();
    }
    public int getSum(int a, int b){
        System.out.println("getSum() method called");
        return a+b;
    }
}
