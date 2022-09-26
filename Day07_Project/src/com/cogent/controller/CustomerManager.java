/**
 * 
 */
package com.cogent.controller;

import java.util.Scanner;

import com.cogent.bean.CustomerBean;
import com.cogent.repo.CustomerRepo;

/**
 * @author dick
 *
 *         26 сент. 2022 г.
 */
public class CustomerManager {

	/**
	 * 
	 */
	public CustomerManager() {
		// TODO Auto-generated constructor stub
	}

	static CustomerRepo cRepo = new CustomerRepo();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = " ";
		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("************************************\n" + "CUSTOMER MANAGEMENT SYSTEM\n"
					+ "************************************\n" + "1. Add Customer\n" + "2. View All Customer\n"
					+ "3. Search Customer by Id\n" + "4. Exit");
			input = scan.next();

			switch (input) {
			case "1":
				addCustomer();
				break;
			case "2":
				cRepo.viewAllCustomer();
				break;
			case "3": 
				System.out.println("Enter Customer ID ");
				cRepo.searchCustomerById(scan.nextLong());
				break;
			case "4":

				break;
			}

		} while (!input.equals("4"));

	}

	/**
	 * 
	 */
	private static void addCustomer() {
		// TODO Auto-generated method stub
		String in = "Y";
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Cutomer ID ");
			long id = scan.nextLong();
			System.out.println("Enter Cutomer name ");
			scan.nextLine();
			String name = scan.nextLine();
			cRepo.addCustomer(new CustomerBean(id, name));
			System.out.println("Add another? Y or N");
			in = scan.nextLine();

		} while (!in.equals("N"));
	}

}
