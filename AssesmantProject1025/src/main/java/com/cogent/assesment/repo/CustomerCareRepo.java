package com.cogent.assesment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.assesment.entity.CustomerCare;

public interface CustomerCareRepo extends JpaRepository<CustomerCare, Long> {

}
