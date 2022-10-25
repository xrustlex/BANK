package com.cogent.assesment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.assesment.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Long> {

}
