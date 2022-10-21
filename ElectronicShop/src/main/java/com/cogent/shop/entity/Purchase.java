package com.cogent.shop.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
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
	
	public Purchase() {
		super();
	}

	public Purchase(long id, String productName, BigDecimal cost, Date dateOfPurchase, Date deliveryDate,
			String customerFeedback) {
		super();
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.dateOfPurchase = dateOfPurchase;
		this.deliveryDate = deliveryDate;
		this.customerFeedback = customerFeedback;
	}

	public long getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public String getCustomerFeedback() {
		return customerFeedback;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", productName=" + productName + ", cost=" + cost + ", dateOfPurchase="
				+ dateOfPurchase + ", deliveryDate=" + deliveryDate + ", customerFeedback=" + customerFeedback + "]";
	}

}
