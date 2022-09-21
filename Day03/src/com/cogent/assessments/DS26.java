/**
 * 
 */
package com.cogent.assessments;

/**
 * @author dick
 *
 *         21 сент. 2022 г.
 */
class DS26 {

	/**
	 * @param args
	 */
	static void print(long n) {
		System.out.println(n);
	}

	static final int NUMBER = 2;
	static final int POWER = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = NUMBER;
		int pow = POWER;
		long res = num;
		for (int i = 2; i <= pow; i++)
			res = res * num;
		print(res);

	}

}
