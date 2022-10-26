
package com.cogent.test;

import java.util.Arrays;

/**
 * @author dick
 *
 *         3 окт. 2022 г.
 */
public class Test {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 6, 4, 2, 8, 0, 9, 7, 55, -45, 9056 };
		int[] arr1 = {1, 2, 3, 4, 44, 555, 6969, -111, -22, -3};

		System.out.print("INITIAL ARRAY IS: ");
		for (int e : arr)
			System.out.print(" " + e + " ");
		System.out.println();
		
		System.out.print(" SORTED ARRAY IS: ");
		Arrays.sort(arr);
		Arrays.sort(arr1);
		for (int e : arr)
			System.out.print(" " + e + " ");
		System.out.print("\nANOTHER ARRAY IS: ");
		for (int e : arr1)
            System.out.print(" " + e + " ");
	}

}
