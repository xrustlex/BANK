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
			System.out.println("Class is available\n");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "Vadim123");
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?)");//SQL query as string
			
			ps.setInt(1, 1004);
			ps.setString(2, "Dan");
			ps.setString(3, "dan@test.jdbc");
			
			int n = ps.executeUpdate();
			System.out.println("TOTAL RECORDS UPDATED:\t" + n);
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();

		}
	}

}
