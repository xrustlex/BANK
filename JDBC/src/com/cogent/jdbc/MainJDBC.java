/**
 * 
 */
package com.cogent.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author dick
 *
 * 10 окт. 2022 г.
 */
public class MainJDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		try {
			
			Class.forName("com.mysql.jdbs.Driver");
			System.out.println("Class is available");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
