package com.cogent.repo;
import java.util.List;

import com.cogent.bean.EmployeeBean;
import com.cogent.bean.EmployeeBean;

/**
 * 
 */

/**
 * @author dick
 *
 * 28 сент. 2022 г.
 */
public interface EmployeeRepo {
	
	public void addEmloyee(EmployeeBean employeeBean);
	public void viewAllEmloyees();
	public EmployeeBean findById(long id);
	public void deleteById(long id);
	public EmployeeBean findYoungest();
	public List<EmployeeBean> findByCountry(String country);
	public List<EmployeeBean> findByCity(String City);
	
}
