/**
 * 
 */
package com.cogent.assessments;

/**
 * @author dick
 *
 *         21 сент. 2022 г.
 */
class DS27 {

	/**
	 * @param args
	 */
	static void print(long n) {
		System.out.println(n);
	}

	static final int NUMBER = 98765432;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = NUMBER;
		int res = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			res = 10 * res + rem;
			num /= 10;
		}
		System.out.println(res);
	}

}
