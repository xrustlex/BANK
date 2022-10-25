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

import com.cogent.assesment.entity.Plan;
import com.cogent.assesment.repo.PlanRepo;

@RestController
@RequestMapping("/api/plan")
public class PlanController {

	@Autowired
	PlanRepo planRepo;

	@PostMapping("/add")
	Plan addPlan(@RequestBody Plan plan) {
		return planRepo.save(plan);
	}

	@GetMapping("showAll")
	List<Plan> showAllPlans() {
		return planRepo.findAll();
	}
	
	@DeleteMapping("/deleteplan/{id}")
	String deletePlan(@PathVariable("id") long id) {
		try {
			planRepo.deleteById(id);
			return "PLAN DELETION SUCCESSFUL";
		} catch (Exception e) {
			e.printStackTrace();
			return "PLAN DELETION UNSUCCESSFUL";
		}
		
	}
}
