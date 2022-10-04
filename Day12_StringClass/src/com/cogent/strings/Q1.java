/**
 * 
 */
package com.cogent.strings;

import java.util.Scanner;

/**
 * @author dick
 *
 *         4 окт. 2022 г.
 */
public class Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inString = "", outString = "";
		System.out.println("ENTER YOUR PHRASE");

		Scanner scan = new Scanner(System.in);
		inString = scan.nextLine();

		inString.trim();
		String[] sArr = inString.split(" ");
		for (int i = (sArr.length - 1); i >= 0; i--)
			System.out.print(sArr[i] + " ");

	}

}
