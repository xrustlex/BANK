/**
 * 
 */
package com.cogent.jdbc.students;

/**
 * @author dick
 *
 * 12 окт. 2022 г.
 */
public class StudentBean {
	
	private int studentID;
	private String studentName;
	private String studentEmail;

	public StudentBean(int studentID, String studentName, String studentEmail) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	
	
}
