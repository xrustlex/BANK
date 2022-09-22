/**
 * 
 */
package com.cogent.arrays;

import java.util.Arrays;

/**
 * @author dick
 *
 *         22 сент. 2022 г.
 */
class DS36 {

	/**
	 * DS3.6.WAP to Remove Duplicate Elements From an Array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 132, 4536, 45, 654, 45, 102, 7658, 9999, 9999, 102 };
		Arrays.sort(array);
		for (int e : array)
			System.out.print(e + " ");

		System.out.println();

		for (int i = 0; i < array.length - 1; i++)
			if (array[i] != array[i + 1])
				System.out.print(array[i] + " ");
		System.out.print(array[array.length - 1] + " ");

		;
	}

}
