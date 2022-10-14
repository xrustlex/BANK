/**
 * 
 */
package com.cogent.bean;

import java.util.*;
import java.io.*;
import java.math.*;
import java.sql.*;
import java.sql.Date;

/**
 * @author dick
 *
 *         14 окт. 2022 г.
 */
//Products (pID int, pName varchar(255), pCat varchar(255), 
//price DECIMAL (10,2), manufDate date, expDate date)
public class ProductBean implements Serializable {

	private static final long serialVersionUID = -7765590728013703393L;
	private long id;
	private String name;
	private String categ;
	private BigDecimal price;
	private Date made;
	private Date exp;

	public ProductBean(int id, String name, String categ, BigDecimal price, Date made, Date exp) {

		this.id = id;
		this.name = name;
		this.categ = categ;
		this.price = price;
		this.made = made;
		this.exp = exp;

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

	public String getCateg() {
		return categ;
	}

	public void setCateg(String categ) {
		this.categ = categ;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getMade() {
		return made;
	}

	public void setMade(Date made) {
		this.made = made;
	}

	public Date getExp() {
		return exp;
	}

	public void setExp(Date exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {

		return "ID " + id + ", product " + name + ", category " + categ + ", price " + price + ", date of make " + made
				+ ", expiration date " + exp;

	}

}
