package com.example.EmpManage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmpManage.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
}
