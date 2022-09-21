/**
 * 
 */
package com.cogent.assessments;

/**
 * @author dick
 *
 *         21 сент. 2022 г.
 */
public class DS22 {

	/**
	 * @param args
	 */
	static final int MAX = 2;
	static final int MIN = 100;

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / i; ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		for (int n = MIN; n <= MAX; n++)
			if (isPrime(n))
				System.out.println(n);

	}
}