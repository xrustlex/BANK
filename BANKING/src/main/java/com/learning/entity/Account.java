package com.learning.entity;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNTS")
public class Account {
/*
 * accountType:Enum(SB/CA),
 * accountBalance:Number,
 * approved: no,
 * accountNumber: Number,
 * dateOfCreation: date/time,
 * customerId: Number
 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long number;
	
}
