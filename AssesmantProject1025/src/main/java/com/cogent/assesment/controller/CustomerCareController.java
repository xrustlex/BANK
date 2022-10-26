package com.cogent.assesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.assesment.entity.CustomerCare;
import com.cogent.assesment.repo.CustomerCareRepo;

@RestController
@RequestMapping("/api/customercare")
public class CustomerCareController {

	@Autowired
	CustomerCareRepo customerCareRepo;

	@PostMapping("/add")
	CustomerCare addCustomerCare(@RequestBody CustomerCare customerCare) {
		return customerCareRepo.save(customerCare);
	}

	@GetMapping("show")
	List<	CustomerCare> showAllCustomerCare() {
		return customerCareRepo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteCustomerCare(@PathVariable("id") long id) {
		try {
			customerCareRepo.deleteById(id);
			return "Customer Care DELETION SUCCESSFUL";
		} catch (Exception e) {
			e.printStackTrace();
			return "Customer Care DELETION UNSUCCESSFUL";
		}
		
	}
}
