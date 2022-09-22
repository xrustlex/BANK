/**
 * 
 */
package com.cogent.arrays;

/**
 * @author dick
 *
 *         22 сент. 2022 г.
 */
class DS37 {

	/**
	 * DS3.7.WAP to Merge Two Arrays
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 132, 4536, 45, 654, 45, 102, 7658, 9999, 9999, 102 };
		int[] arr2 = { 45, 102, 132, 654, 4536, 7658, 9999 };
		int[] newArr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++)
			newArr[i] = arr1[i];

		for (int i = 0; i < arr2.length; i++)
			newArr[i + arr1.length] = arr2[i];

		for (int e : newArr)
			System.out.print(e + " ");
	}

}
