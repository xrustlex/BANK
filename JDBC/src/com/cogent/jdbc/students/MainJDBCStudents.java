/**
 * 
 */
package com.cogent.jdbc.students;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

/**
 * @author dick
 *
 *         12 окт. 2022 г.
 */
public class MainJDBCStudents {

	public static void main(String[] args) {

		Properties prop = new Properties();
		InputStream configFile;
		Scanner scan = new Scanner(System.in);

		try {

			configFile = new FileInputStream(
					"/Users/dick/git/cogent/JDBC/src/com/cogent/jdbc/students/config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));

		} catch (ClassNotFoundException | IOException e) {

			e.printStackTrace();

		}

		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENTS VALUES (?,?,?)");) {

			System.out.println("\n");
			System.out.println("Class is available\n");

			System.out.println("ENTER STUDENT ID\t");
			ps.setInt(1, scan.nextInt());

			System.out.println("ENTER STUDENT NAME\t");
			ps.setString(2, scan.next());

			System.out.println("ENTER STUDENT EMAIL\t");
			ps.setString(3, scan.next());

			System.out.println("TOTAL RECORDS UPDATED:\t" + ps.executeUpdate());

			scan.close();
			ps.close();
			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();

		}
		
		//TODO READ FROM DARABASE
		
		//TODO TO SAVE TO students.dat FILE
		
		//TODO PRINT FROM students.dat FILE
		
	}

}
