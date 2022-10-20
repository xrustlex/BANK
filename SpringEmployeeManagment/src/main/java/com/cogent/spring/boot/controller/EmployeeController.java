package com.cogent.spring.boot.controller;
import com.cogent.spring.boot.controller.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cogent.spring.boot.bean.EmployeeBean;
import com.cogent.spring.boot.repo.EmployeeRepo;

@Controller
public class EmployeeController {

	// WRITE LOGIC TO PERFORM CRUD OPERATIONS USING HTTP METHODS
	// USE JPA REPOSITORY TO VARIOUS OPERATIONS
	
	// GET
	// POST
	// PUT
	// DELETE

	// READ
	@Autowired
	EmployeeRepo employeeRepo;
	
	// creating a get mapping that retrieves all the books detail from the database
	@GetMapping("/getallemployees")
	private List<EmployeeBean> getAllEmployees() {
		return employeeRepo.findAll();
	}
	
	// CREATE
	
	// UPDATE

	// DELETE

}
