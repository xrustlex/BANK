/**
 * 
 */
package com.cogent.bean;

import java.util.*;
import java.math.*;
import java.sql.*;
import java.sql.Date;

/**
 * @author dick
 *
 * 14 окт. 2022 г.
 */
//Products (pID int, pName varchar(255), pCat varchar(255), 
//price DECIMAL (10,2), manufDate date, expDate date)
public class ProductBean {

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
	
}
