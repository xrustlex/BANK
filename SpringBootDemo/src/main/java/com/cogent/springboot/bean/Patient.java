package com.cogent.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Patient {
	
	public void request() {

		System.out.println("\nPatient IS REQUESTING");

	}

}
