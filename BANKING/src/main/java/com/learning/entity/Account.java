package com.learning.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNTS")
public class Account {
/*
 * accountType: Enum(SB/CA),
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
	
}
