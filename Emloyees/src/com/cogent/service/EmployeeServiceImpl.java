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
		employeeRepo.addEmloyee(employeeBean);
	}

	@Override
	public List<EmployeeBean> viewAllEmloyees() {
		return employeeRepo.viewAllEmloyees();
	}

	@Override
	public EmployeeBean findById(long id) {
		return employeeRepo.findById(id);
	}

	@Override
	public void deleteById(long id) {
		employeeRepo.deleteById(id);
	}

	@Override
	public EmployeeBean findYoungest() {
		return employeeRepo.findYoungest();
	}

	@Override
	public List<EmployeeBean> findByCountry(String country) {
		return employeeRepo.findByCountry(country);
	}

	@Override
	public List<EmployeeBean> findByCity(String country, String city) {
		return employeeRepo.findByCity(country, city);
	}

}
