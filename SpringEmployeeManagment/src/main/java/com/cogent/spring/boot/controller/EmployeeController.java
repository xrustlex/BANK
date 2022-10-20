package com.cogent.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.spring.boot.bean.Employee;
import com.cogent.spring.boot.repo.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepo employeeRepo;
	
	@PostMapping("/addemployee")
	Employee newEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@GetMapping("/getallemployees")
	private List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

}
