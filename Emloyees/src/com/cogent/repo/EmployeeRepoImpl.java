/**
 * 
 */
package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author dick
 *
 *         28 сент. 2022 г.
 */
public class EmployeeRepoImpl implements EmployeeRepo {

	List<EmployeeBean> employees = new ArrayList<>();

	@Override
	public void addEmloyee(EmployeeBean employeeBean) {
		employees.add(employeeBean);
	}

	@Override
	public void viewAllEmloyees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeBean findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeBean findYoungest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeBean> findByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeBean> findByCity(String City) {
		// TODO Auto-generated method stub
		return null;
	}

}
