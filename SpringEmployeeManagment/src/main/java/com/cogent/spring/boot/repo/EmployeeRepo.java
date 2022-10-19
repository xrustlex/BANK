package com.cogent.spring.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.spring.boot.bean.EmployeeBean;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeBean, Long> {
	// contains predefined methods
}
