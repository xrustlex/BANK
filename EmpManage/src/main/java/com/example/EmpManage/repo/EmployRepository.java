package com.example.EmpManage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmpManage.entity.Employee;

public interface EmployRepository extends JpaRepository<Employee, Integer>{
	
}
