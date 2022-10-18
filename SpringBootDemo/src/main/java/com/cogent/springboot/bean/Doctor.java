package com.cogent.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

	public void treat() {
		
		System.out.println("\nDoctor IS TREATING");
	}
	
}
