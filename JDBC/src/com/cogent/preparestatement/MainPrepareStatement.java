/**
 * 
 */
package com.cogent.preparestatement;

import java.sql.*;


/**
 * @author dick
 *
 * 11 окт. 2022 г.
 */
public class MainPrepareStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class is available");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "Vadim123");
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?)");
			
			ps.setInt(1, 1001);
			ps.setString(2, "Adam");
			ps.setString(3, "adam@test.jdbc");
			
			int n = ps.executeUpdate();
			System.out.println( n + "\tRECORDS UPDATED");
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();

		}
	}

}
