/**
 * 
 */
package com.cogent.jdbc.students;

import java.io.*;
import java.sql.*;
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

		List<StudentBean> studentList = new ArrayList();

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
		// TODO READ STUDENTS FROM DARABASE
		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS");) {

			while (rs.next()) {

				StudentBean s = new StudentBean(rs.getInt(1), rs.getString(2), rs.getString(3));
				studentList.add(s);

			}
			
		} catch (SQLException e) {

			e.printStackTrace();

		}
		// PRINTING  STUDENT LIST TO CONSOLE
		studentList.forEach(System.out::println);
		// TODO TO SAVE TO students.dat FILE

		// TODO PRINT FROM students.dat FILE

	}

}
