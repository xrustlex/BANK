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

		InputStream configFile = null;
		Properties prop = new Properties();
	
		List<StudentBean> studentList = new ArrayList<StudentBean>();

		try {
			
			configFile = new FileInputStream("config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));

		} catch (ClassNotFoundException | IOException e) { e.printStackTrace(); }

		try (
				Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENTS VALUES (?,?,?)");) {
			
			Scanner scan = new Scanner(System.in);

			System.out.println("\n");
			System.out.println("Class is available\n");

			System.out.println("ENTER STUDENT ID\t");
			ps.setInt(1, scan.nextInt());

			System.out.println("ENTER STUDENT NAME\t");
			ps.setString(2, scan.next());

			System.out.println("ENTER STUDENT EMAIL\t");
			ps.setString(3, scan.next());

			System.out.println("\n");
			System.out.println("TOTAL RECORDS UPDATED:\t" + ps.executeUpdate());
			
			scan.close();
			ps.close();
			conn.close();
			
		} catch (SQLException e) { e.printStackTrace(); }
		
		// READING STUDENTS FROM DARABASE
		try (
				Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS");) {
			
			while (rs.next()) {

				studentList.add(new StudentBean(rs.getInt(1), rs.getString(2), rs.getString(3)));

			}
			// PRINTING STUDENT LIST TO CONSOLE
			studentList.forEach(System.out::println);
			
			// SAVING TO students.dat FILE
			File f = new File("students.bin");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(studentList);
			
			// TODO PRINT FROM students.dat FILE
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			List<StudentBean> sb = (ArrayList<StudentBean>) obj;
			
			sb.forEach(System.out::println);
			
			ois.close();
			oos.close();
			conn.close();
			
		} catch (SQLException | IOException | ClassNotFoundException e) {

			e.printStackTrace();

		}
		
	}

}




















