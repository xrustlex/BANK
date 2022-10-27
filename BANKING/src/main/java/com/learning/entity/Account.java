package com.learning.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNTS")
public class Account {
/*
 * accountType: enum(SB/CA),
 * accountBalance: Number,
 * approved: no,
 * accountNumber: Number,
 * dateOfCreation: date/time,
 * customerId: Number
 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private AccountType accountType;
	private BigDecimal accountBalance;
	private boolean approved;
	private long accountNumber;
	private Date dateOfCreation;
	private long customerId;
	
	public Account() {
		super();
	}

	public Account(AccountType accountType, BigDecimal accountBalance, boolean approved, long accountNumber,
			Date dateOfCreation, long customerId) {
		super();
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.approved = approved;
		this.accountNumber = accountNumber;
		this.dateOfCreation = dateOfCreation;
		this.customerId = customerId;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	
}
