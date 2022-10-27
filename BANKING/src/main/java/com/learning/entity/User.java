package com.learning.entity;

import javax.persistence.*;


@Entity
@Table(name="USERS")
public class User {
/*
 * id: Number,
 * username:String,
 * fullname:String,
 * password: String 
 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String username;
	private String fullName;
	
}
