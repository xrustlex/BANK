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
		int[] array = { 1, 11, 22, 33, 44, 55, 66, 77, 88, 99, 0 };
		int element = 22;
		for (int i = 0; i < array.length; i++)
			if (element == array[i]) {
				System.out.println(element + " is in the array");
			}
	}
}
