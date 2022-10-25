package com.cogent.assesment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerCare")
public class CustomerCare {
	// id, description, userID, status
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="description")
	private String description;
	@Column(name="user_id")
	private long userID;
	@Column(name="status")
	private String status;
	public CustomerCare() {
		super();
	}
	public CustomerCare(long id, String description, long userID, String status) {
		super();
		this.id = id;
		this.description = description;
		this.userID = userID;
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
