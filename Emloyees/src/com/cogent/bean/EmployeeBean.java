/**
 * 
 */
package com.cogent.bean;

/**
 * @author dick
 *
 *         28 сент. 2022 г.
 */
public class EmployeeBean {

	private int employeeAge;
	private long employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	
	private String employeeEmail;
	private boolean employeeIsMarried;
	private String employeeCity;
	private String employeeCountry;

	/*
	 * public EmployeeBean() { super(); }
	 */
	public EmployeeBean(long employeeId, int employeeAge, String employeeFirstName, String employeeLastName,
			String employeeEmail, boolean employeeIsMarried, String employeeCity, String employeeCountry) {

		this.employeeId = employeeId;
		this.employeeAge = employeeAge;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;

		this.employeeEmail = employeeEmail;
		this.employeeIsMarried = employeeIsMarried;
		this.employeeCity = employeeCity;
		this.employeeCountry = employeeCountry;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public boolean isEmployeeIsMarried() {
		return employeeIsMarried;
	}

	public void setEmployeeIsMarried(boolean employeeIsMarried) {
		this.employeeIsMarried = employeeIsMarried;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	public String getEmployeeCountry() {
		return employeeCountry;
	}

	public void setEmployeeCountry(String employeeCountry) {
		this.employeeCountry = employeeCountry;
	}

	@Override
	public String toString() {
		return "EmpoyeeBean [employeeAge=" + employeeAge + ", employeeId=" + employeeId + ", employeeFirstName="
				+ employeeFirstName + ", employeeLastName=" + employeeLastName + ", employeeEmail=" + employeeEmail
				+ ", employeeIsMarried=" + employeeIsMarried + ", employeeCity=" + employeeCity + ", employeeCountry="
				+ employeeCountry + "]";
	}

}
