package com.cogent.spring.boot.repo;

import com.cogent.spring.boot.bean.EmployeeBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeBean, Long> {
	// contains predefined methods
}
