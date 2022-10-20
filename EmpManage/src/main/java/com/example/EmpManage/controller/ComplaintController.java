package com.example.EmpManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpManage.entity.Complaint;
import com.example.EmpManage.repo.ComplaintRepo;

@RestController
public class ComplaintController {

	@Autowired
	ComplaintRepo complaintRepo;

	@PostMapping("/addcomplaint")
	Complaint newComplaint(@RequestBody Complaint complaint) {
		return complaintRepo.save(complaint); // SQL INSERT INTO DB
	}

	@GetMapping("/getcomplaint") // End Point
	// @RequestMapping(method=RequestMethod.GET ,value="/users")
	List<Complaint> getAllComplaints() {
		return complaintRepo.findAll();
	}
	
}
