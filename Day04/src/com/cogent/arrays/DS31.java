/**
 * 
 */
package com.cogent.arrays;

/**
 * @author dick
 *
 *         22 сент. 2022 г.
 */
class DS31 {
	/**
	 * DS3.1.WAP to Search an Element in an Array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 132, 4536, 45, 654, 7658, 9999, 102 };
		int element = 45;
		for (int i = 0; i < array.length; i++)
			if (element == array[i]) {
				System.out.println(element + " is in the array");
			}
	}
}
