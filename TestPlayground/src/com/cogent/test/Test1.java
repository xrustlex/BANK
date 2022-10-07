/**
 * 
 */
package com.cogent.test;

/**
 * @author dick
 *
 *         4 окт. 2022 г.
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "    HELLO MY CRAZY WORLD!    ";
		String s1 = s.trim();
		String[] arr = s1.split(" ");
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.println(arr[i] + " ");

	}

}
