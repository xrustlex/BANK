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

import com.example.EmpManage.entity.Complaint;
import com.example.EmpManage.repo.ComplaintRepo;

@RestController
@RequestMapping("api/complaint")
public class ComplaintController {

	@Autowired
	ComplaintRepo complaintRepo;

	@PostMapping("/addcomplaint")
	Complaint newComplaint(@RequestBody Complaint complaint) {
		return complaintRepo.save(complaint); // SQL INSERT INTO DB
	}

	@GetMapping("/getcomplaint") // End Point
	List<Complaint> getAllComplaints() {
		return complaintRepo.findAll();
	}
	
	@DeleteMapping("/deletecomplaint/{id}")
	String deleteComplaint(@PathVariable("id")long id) {
		try {
			complaintRepo.deleteById(id);
			return "COMPLAINT DELETION SUCCESSFUL";
		} catch (Exception e) {
			e.printStackTrace();
			return "COMPLAINT DELETION UNSUCCESSFUL";
		}
	}
	
}
