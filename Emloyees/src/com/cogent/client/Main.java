/**
 * 
 */
package com.cogent.client;

import java.util.*;
import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImpl;
import com.cogent.service.EmployeeService;
import com.cogent.service.EmployeeServiceImpl;

/**
 * @author dick
 *
 *         2 окт. 2022 г.
 */
public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<EmployeeBean> employees = new ArrayList<>();

		employees.add(
				new EmployeeBean(1001, 31, "Adam", "Abrams", "Adam.Abrams@test.com", false, "Arlington", "Andorra"));
		employees.add(new EmployeeBean(1002, 32, "Benjamin", "Burton", "Benjamin.Burton@test.com", true, "Boston",
				"Bermuda"));
		employees.add(
				new EmployeeBean(1003, 33, "Charles", "Calvin", "Charles.Calvin@test.com", false, "Chelsea", "Canada"));
		employees.add(
				new EmployeeBean(1004, 34, "Dennis", "Duncan", "Dennis.Duncan@test.com", true, "Denver", "Denmark"));

		for (int i = 0; i < employees.size(); i++)
			System.out.println(employees.get(i).toString());
		
		//ADD MORE	
		employees.add(new EmployeeBean(991, 21, "Eric", "Elton", "Eric.Elton@test.com", false, "Enfield", "Egypt"));
		employees.add(new EmployeeBean(992, 22, "Franklin", "Farewell", "Franklin.Farewell@test.com", true, "Fartown",
				"France"));
		employees.add(
				new EmployeeBean(993, 23, "George", "Grace", "George.Grace@test.com", false, "Ghostown", "Germany"));
		employees
				.add(new EmployeeBean(994, 24, "Helen", "Hooter", "Helen.Hooter@test.com", true, "Hanover", "Hungary"));

		System.out.println();

		for (int i = 0; i < employees.size(); i++)
			System.out.println(employees.get(i).toString());

	}

}
