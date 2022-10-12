/**
 * 
 */
package com.cogent.jdbc.employees;

import java.io.*;
import java.sql.*;
import java.util.*;

/**
 * @author dick
 *
 *         11 окт. 2022 г.
 */
public class MainJDBCEmployees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Properties prop = new Properties();
		InputStream configFile;

		try {
			
			configFile = new FileInputStream("/Users/dick/git/cogent/JDBC/src/config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}

		try (	Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement("INSERT INTO EMPLOYEES VALUES (?,?,?)");
				) {

			System.out.println("Class is available\n");
			System.out.println();

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

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			;
		}
	}

}
