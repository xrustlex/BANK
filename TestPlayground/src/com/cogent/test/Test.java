/**
 * 
 */
package com.cogent.test;

import java.util.Arrays;

/**
 * @author dick
 *
 *         3 окт. 2022 г.
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 5, 6, 4, 2, 8, 0, 9, 7 };
		for (int e : arr)
			System.out.print(e + " ");
		System.out.println();
		System.out.println("-------------------");
		Arrays.sort(arr);
		for (int e : arr)
			System.out.print(e + " ");
	}

}
