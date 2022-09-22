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
class DS34 {

	/**
	 * DS3.4.WAP to Sort the Elements of an Array in Descending Order
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 132, 4536, 45, 654, 7658, 9999, 102 };
		Arrays.sort(array);
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
	}

}
