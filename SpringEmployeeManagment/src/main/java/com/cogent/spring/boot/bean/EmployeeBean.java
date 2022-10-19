package com.cogent.spring.boot.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;

@EntityScan
@Table(name="Employees")
public class EmployeeBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "dept")
	private String dept;
	@Column(name = "pay")
	private BigDecimal pay;
	
	@Bean
	public EmployeeBean getEmployeeBean() {
		return new EmployeeBean();
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", dept=" + dept + ", pay=" + pay + "]";
	}

	public EmployeeBean() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public BigDecimal getPay() {
		return pay;
	}

	public void setPay(BigDecimal pay) {
		this.pay = pay;
	}
	
}
