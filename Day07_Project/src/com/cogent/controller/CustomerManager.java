/**
 * 
 */
package com.cogent.controller;

import java.util.Scanner;

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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Y";
		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("************************************\n" + "CUSTOMER MANAGEMENT SYSTEM\n"
					+ "************************************\n" + "1. Add Customer\n" + "2. View All Customer\n"
					+ "3. Search Customer by Id\n" + "4. Exit");
			input = scan.next();

		} while (!input.equals("N"));

	}

}
