/**
 * 
 */
package com.cogent.preparestatement;

import java.sql.*;
import java.util.Scanner;

/**
 * @author dick
 *
 *         11 окт. 2022 г.
 */
public class MainPrepareStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int c = 1;
		Connection conn;
		PreparedStatement ps;
		Scanner scan = new Scanner(System.in);

		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "Vadim123");
			ps = conn.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?)");// SQL query as a string

			while (c != 0) {

				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Class is available\n");

				System.out.println("ENTER STUDENT ID:\t");
				ps.setInt(1, scan.nextInt());

				System.out.println("ENTER STUDENT NAME:\t");
				ps.setString(2, scan.next());

				System.out.println("ENTER STUDENT EMAIL:\t");
				ps.setString(3, scan.next());

				int n = ps.executeUpdate();
				System.out.println("TOTAL RECORDS UPDATED:\t" + n);

				System.out.println("ENTER 0 TO EXIT");
				System.out.println("ENTER 1 TO ADD ANOTHER\n");
				c = scan.nextInt();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
