package com.cogent.service;

import java.util.*;

import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImpl;

/**
 * @author dick
 *
 *         3 окт. 2022 г.
 */
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepo employeeRepo = new EmployeeRepoImpl();
	@Override
	public void addEmployee(EmployeeBean employeeBean) {
		// TODO Auto-generated method stub
		employeeRepo.addEmloyee(employeeBean);
	}

	@Override
	public List<EmployeeBean> viewAllEmloyees() {
		// TODO Auto-generated method stub
		return employeeRepo.viewAllEmloyees();
	}

	@Override
	public EmployeeBean findById(long id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
	}

	@Override
	public EmployeeBean findYoungest() {
		// TODO Auto-generated method stub
		return employeeRepo.findYoungest();
	}

	@Override
	public List<EmployeeBean> findByCountry(String country) {
		// TODO Auto-generated method stub
		return employeeRepo.findByCountry(country);
	}

	@Override
	public List<EmployeeBean> findByCity(String country, String city) {
		// TODO Auto-generated method stub
		return employeeRepo.findByCity(country, city);
	}
	
}
