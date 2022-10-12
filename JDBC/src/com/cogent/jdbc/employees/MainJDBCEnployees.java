/**
 * 
 */
package com.cogent.jdbc.employees;

import java.sql.*;
import java.util.Scanner;

/**
 * @author dick
 *
 *         11 окт. 2022 г.
 */
public class MainJDBCEnployees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 1;
		Connection conn = null;
		PreparedStatement ps = null;
		Scanner scan = new Scanner(System.in);

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class is available\n");
			System.out.println();
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestDB?characterEncoding=utf8", "root", "Vadim123");
			ps = conn.prepareStatement("INSERT INTO EMPLOYEES VALUES (?,?,?)");
			
			System.out.println("ENTER eID\t");
			ps.setInt(1, scan.nextInt());
			
			System.out.println("ENTER eNAME\t");
			ps.setString(2, scan.next());
			
			System.out.println("ENTER eDept\t");
			ps.setString(3, scan.next());
			
			System.out.println("TOTAL RECORDS UPDATED:\t" + ps.executeUpdate());
			
			scan.close();
			ps.close();
			conn.close();

		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		finally {
			;
		}
	}

}
