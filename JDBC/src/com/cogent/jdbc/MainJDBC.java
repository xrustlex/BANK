/**
 * 
 */
package com.cogent.jdbc;

import java.sql.*;

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
			
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("Class is available");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "Vadim123");
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from products");
			
			while (rs.next())
				System.out.println(rs.getString(1)+" " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getString(4) + " " + rs.getString(5));

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();

		}

	}

}
