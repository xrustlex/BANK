package com.cogent.spring.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.spring.boot.bean.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
