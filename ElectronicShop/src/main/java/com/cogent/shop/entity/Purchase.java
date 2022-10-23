package com.cogent.shop.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Purchases")
//Entity class(Purchase) can have id, producNname, cost ,dateOfPurchase, deliveryDate, customerFeedback 
public class Purchase {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String productName;
	private BigDecimal cost;
	private Date dateOfPurchase;
	private Date deliveryDate;
	private String customerFeedback;

}
