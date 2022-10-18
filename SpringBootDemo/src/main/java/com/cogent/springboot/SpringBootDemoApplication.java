package com.cogent.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.springboot.bean.Ambulance;
import com.cogent.springboot.bean.Car;
import com.cogent.springboot.bean.Doctor;
import com.cogent.springboot.bean.Nurse;
import com.cogent.springboot.bean.Patient;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringBootDemoApplication.class, args);
		
		Car car = ctx.getBean(Car.class);
		car.drive();
		
		Ambulance amb = ctx.getBean(Ambulance.class);
		amb.respond();
		
		Doctor doc = ctx.getBean(Doctor.class);
		doc.treat();
		
		Nurse nrs = ctx.getBean(Nurse.class);
		nrs.care();
		
		Patient pat = ctx.getBean(Patient.class);
		pat.request();
		
	}

}
