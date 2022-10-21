package com.example.EmpManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpManage.entity.Employee;
import com.example.EmpManage.repo.EmployRepository;

@RestController

@RequestMapping("api/employee")
public class EmployeeController {

	@Autowired
	EmployRepository employRepository;

	@PostMapping("/addemployee")
	Employee newEmployee(@RequestBody Employee employee) {
		return employRepository.save(employee); // insert SQL
	}

	@GetMapping("/getemployee") // End Point
	// @RequestMapping(method=RequestMethod.GET ,value="/users")
	List<Employee> getAllEmployee() {
		return employRepository.findAll();
	}

}
