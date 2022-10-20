package com.example.EmpManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpManage.entity.Payroll;
import com.example.EmpManage.repo.PayrollRepo;

@RestController
public class PayrollController {

	@Autowired
	PayrollRepo payrollRepo;

	@PostMapping("/addpayroll")
	Payroll newPayroll(@RequestBody Payroll payroll) {
		return payrollRepo.save(payroll);
	}

	@GetMapping("/getpayroll") // End Point
	List<Payroll> getAllPayroll() {
		return payrollRepo.findAll();
	}
	
}
