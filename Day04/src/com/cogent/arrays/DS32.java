/**
 * 
 */
package com.cogent.arrays;

/**
 * @author dick
 *
 *         22 сент. 2022 г.
 */
class DS32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int[] array = { 132, 4536, 45, 654, 7658, 9999, 102 };
		for (int i = 0; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
		System.out.println(max);
	}

}
