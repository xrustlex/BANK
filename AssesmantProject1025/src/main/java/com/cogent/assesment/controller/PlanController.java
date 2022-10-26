package com.cogent.assesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.assesment.entity.Plan;
import com.cogent.assesment.repo.PlanRepo;

@RestController
@RequestMapping("/api/plans")
public class PlanController {

	@Autowired
	PlanRepo planRepo;

	@PostMapping("/add")
	Plan addPlan(@RequestBody Plan plan) {
		return planRepo.save(plan);
	}

	@GetMapping("show")
	List<Plan> showAllPlans() {
		return planRepo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	String deletePlan(@PathVariable("id") long id) {
		try {
			planRepo.deleteById(id);
			return "PLAN DELETION SUCCESSFUL";
		} catch (Exception e) {
			e.printStackTrace();
			return "PLAN DELETION UNSUCCESSFUL";
		}
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Plan> updatePlan(@PathVariable long id,@RequestBody Plan planDetails) {
		
        Plan updatePlan = planRepo.findById(id).orElseThrow();
        //updatePlan.setId(planDetails.getId());
        updatePlan.setName(planDetails.getName());
        updatePlan.setCost(planDetails.getCost());
        updatePlan.setValidity(planDetails.getValidity());

        planRepo.save(updatePlan);

        return ResponseEntity.ok(updatePlan);
    }
}
