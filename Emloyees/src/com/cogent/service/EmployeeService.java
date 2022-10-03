/**
 * 
 */
package com.cogent.service;

import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author dick
 *
 * 3 окт. 2022 г.
 */
public interface EmployeeService {
	
	public void addEmloyee(EmployeeBean employeeBean);
	public void viewAllEmloyees();
	public EmployeeBean findById(long id);
	public void deleteById(long id);
	public EmployeeBean findYoungest();
	public List<EmployeeBean> findByCountry(String country);
	public List<EmployeeBean> findByCity(String country, String city);
	
}
