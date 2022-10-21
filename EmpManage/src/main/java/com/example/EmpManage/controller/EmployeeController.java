package com.example.EmpManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpManage.entity.Employee;
import com.example.EmpManage.repo.EmployeeRepo;

@RestController

@RequestMapping("api/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepo employeeRepo;

	@PostMapping("/addemployee")
	Employee newEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee); // insert SQL
	}

	@GetMapping("/getemployee") // End Point
	// @RequestMapping(method=RequestMethod.GET ,value="/users")
	List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	@DeleteMapping("/deleteemployee")
	String deleteEmployee(@PathVariable("id")int id) {
		try {
			employeeRepo.deleteById(id);
			return "DELETION SUCCESSFUL";
		} catch (Exception e) {
			e.printStackTrace();
			return "DELETION UNSUCCESSFUL";
		}
	}

}
