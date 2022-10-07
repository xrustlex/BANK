
package com.cogent.client;

import java.util.*;
import com.cogent.bean.EmployeeBean;
import com.cogent.service.EmployeeService;
import com.cogent.service.EmployeeServiceImpl;

/* @author	dick
 * @date:	2 окт. 2022 г.*/

@FunctionalInterface
interface Displayable {

	void display(EmployeeBean e);

}

public class EmployeeClient {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeServiceImpl();

		employeeService.addEmployee(
				new EmployeeBean(301, 31, "Adam", "Abrams", "Adam.Abrams@test.com", false, "Avon", "Andorra"));
		;
		employeeService.addEmployee(
				new EmployeeBean(302, 32, "Benjamin", "Burton", "Ben.Burton@test.com", true, "Boston", "Bermuda"));
		employeeService.addEmployee(
				new EmployeeBean(303, 33, "Charles", "Calvin", "Chuck.Calvin@test.com", false, "Chelsea", "Canada"));
		employeeService.addEmployee(
				new EmployeeBean(304, 34, "Dennis", "Duncan", "Den.Duncan@test.com", true, "Denver", "Denmark"));

		List<EmployeeBean> employees = employeeService.viewAllEmloyees();
		// FOR LOOP
		System.out.println("FOR LOOP:\n");
		for (int i = 0; i < employees.size(); i++)
			System.out.println(employees.get(i).getEmployeeId() + "\t" + employees.get(i).getEmployeeFirstName() + " "
					+ employees.get(i).getEmployeeLastName() + "\t" + employees.get(i).getEmployeeAge() + "\t"
					+ employees.get(i).getEmployeeEmail() + "\t" + employees.get(i).getEmployeeCity() + "\t"
					+ employees.get(i).getEmployeeCountry());

		System.out.println();
		// FOR EACH LOOP
		System.out.println("FOR EACH LOOP:\n");
		for (EmployeeBean e : employees)
			System.out.println(e);

		// ADDING MORE TO LIST
		employeeService.addEmployee(
				new EmployeeBean(201, 21, "Eric", "Elton", "Eric.Elton@test.com", false, "Enfield", "Egypt"));
		employeeService.addEmployee(new EmployeeBean(202, 22, "Franklin", "Farewell", "Franklin.Farewell@test.com",
				true, "Fartown", "France"));
		employeeService.addEmployee(
				new EmployeeBean(203, 23, "George", "Grace", "George.Grace@test.com", false, "Ghostown", "Germany"));
		employeeService.addEmployee(
				new EmployeeBean(204, 24, "Helen", "Hooter", "Helen.Hooter@test.com", true, "Hanover", "Hungary"));
		System.out.println();

		// LAMBDA EXPRESSION
		System.out.println("LAMBDA EXPRESSION:\n");
		Displayable d = (e) -> System.out.println(e);
		for (EmployeeBean e : employees)
			d.display(e);
		System.out.println();

		// List.forEach()
		System.out.println("LIST.FOREACH():\n");
		employees.forEach((e) -> System.out.println(e));
		System.out.println();

		// AS STREAM
		System.out.println("AS STREAM:\n");
		employees.forEach(System.out::println);

	}

}