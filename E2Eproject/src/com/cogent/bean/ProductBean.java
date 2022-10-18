/**
 * 
 */
package com.cogent.bean;

import java.io.*;
import java.math.*;
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

	public ProductBean(long id, String name, String categ, BigDecimal price, Date made, Date exp) {

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

	public String getName() {
		return name;
	}

	public String getCateg() {
		return categ;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Date getMade() {
		return made;
	}

	public Date getExp() {
		return exp;
	}

	@Override
	public String toString() {

		return "ID " + id + ", product " + name + ", category " + categ + ", price " + price + ", date of make " + made
				+ ", expiration date " + exp;

	}

}
