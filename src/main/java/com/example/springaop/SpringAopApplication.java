package com.example.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringAopApplication.class, args);
		DemoAspect demoAspect=context.getBean(DemoAspect.class);
		ClassA a=context.getBean(ClassA.class);
		a.printHello();
		a.getSum(a.getNum(),a.getNum());

	}
}
