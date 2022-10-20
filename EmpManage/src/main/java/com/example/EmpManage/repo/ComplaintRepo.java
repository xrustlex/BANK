package com.example.EmpManage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmpManage.entity.Complaint;

public interface ComplaintRepo extends JpaRepository<Complaint, Long>{

}
