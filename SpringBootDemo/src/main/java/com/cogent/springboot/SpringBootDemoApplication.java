package com.cogent.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.springboot.bean.Car;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringBootDemoApplication.class, args);
		Car car = ctx.getBean(Car.class);
		car.drive();
		
	}

}
