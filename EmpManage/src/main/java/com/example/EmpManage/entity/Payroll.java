package com.example.EmpManage.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Payroll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private int daysWorked;
	private BigDecimal amount;
	private BigDecimal taxPaid;
	
	public Payroll() {
		super();
	}

	public Payroll(long id, String name, int daysWorked, BigDecimal amount, BigDecimal taxPaid) {
		super();
		this.id = id;
		this.name = name;
		this.daysWorked = daysWorked;
		this.amount = amount;
		this.taxPaid = taxPaid;
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

	public int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getTaxPaid() {
		return taxPaid;
	}

	public void setTaxPaid(BigDecimal taxPaid) {
		this.taxPaid = taxPaid;
	}
	
	
}
