package com.cogent.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	
	private Ambulance ambulance = null;
	private Doctor doctor = null;
	private Nurse nurse = null;
	private Patient patient = null;
	
	Hospital (){
		
		System.out.println("Hospital IS OPEN");
		
	}
	@Autowired
	public void setAmbulance(Ambulance ambulance) {
		this.ambulance = ambulance;
	}

	@Autowired
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	@Autowired
	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}
	@Autowired
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public Ambulance getAmbulance() {
		return ambulance;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public Nurse getNurse() {
		return nurse;
	}
	public Patient getPatient() {
		return patient;
	}
	
}
