/**
 * 
 */
package com.cogent;

import java.util.Scanner;

/**
 * @author dick
 *
 *         29 сент. 2022 г.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("PLEASE ENTER YOUR NAME\t");

		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		System.out.print("YOUR NAME IS\t\t" + name);

	}
}
