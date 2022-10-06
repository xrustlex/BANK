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
public class EmployeeClient {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.addEmloyee(
				new EmployeeBean(1001, 31, "Adam", "Abrams", "Adam.Abrams@test.com", false, "Arlington", "Andorra"));
		employeeService.addEmloyee(new EmployeeBean(1002, 32, "Benjamin", "Burton", "Benjamin.Burton@test.com", true,
				"Boston", "Bermuda"));
		employeeService.addEmloyee(
				new EmployeeBean(1003, 33, "Charles", "Calvin", "Charles.Calvin@test.com", false, "Chelsea", "Canada"));
		employeeService.addEmloyee(
				new EmployeeBean(1004, 34, "Dennis", "Duncan", "Dennis.Duncan@test.com", true, "Denver", "Denmark"));

		List<EmployeeBean> employees = employeeService.viewAllEmloyees();
		for (EmployeeBean e : employees)
			System.out.println(e);

		System.out.println();

		for (int i = 0; i < employees.size(); i++)
			System.out.println(employees.get(i).getEmployeeId() + "\t" + employees.get(i).getEmployeeFirstName() + " "
					+ employees.get(i).getEmployeeLastName() + "\t" + employees.get(i).getEmployeeAge() + "\t"
					+ employees.get(i).getEmployeeEmail() + "\t" + employees.get(i).getEmployeeCity() + "\t"
					+ employees.get(i).getEmployeeCountry());

		employeeService.addEmloyee(
				new EmployeeBean(991, 21, "Eric", "Elton", "Eric.Elton@test.com", false, "Enfield", "Egypt"));
		employeeService.addEmloyee(new EmployeeBean(992, 22, "Franklin", "Farewell", "Franklin.Farewell@test.com", true,
				"Fartown", "France"));
		employeeService.addEmloyee(
				new EmployeeBean(993, 23, "George", "Grace", "George.Grace@test.com", false, "Ghostown", "Germany"));
		employees
				.add(new EmployeeBean(994, 24, "Helen", "Hooter", "Helen.Hooter@test.com", true, "Hanover", "Hungary"));
		employeeService.addEmloyee(new EmployeeBean(992, 22, "Franklin", "Farewell", "Franklin.Farewell@test.com", true,
				"Fartown", "France"));
		
	}

}
