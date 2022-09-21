/**
 * 
 */
package com.cogent.assessments;

/**
 * @author dick
 *
 *         21 сент. 2022 г.
 */
class DS25 {

	/**
	 * @param args
	 */
	static void print(int n) {
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM = 12;
		long factorial = 1;
		for (int i = 1; i <= NUM; ++i) {
			factorial *= i;
		}
		print((int) factorial);
	}

}
