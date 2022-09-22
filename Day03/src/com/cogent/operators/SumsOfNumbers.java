/**
 * 
 */
package com.cogent.operators;

/**
 * @author dick
 *
 *         21 сент. 2022 г.
 */
public class SumsOfNumbers {

	/**
	 * @param args
	 */
	final static int MAX = 10;

	public static void main(String[] args) {

		int oddSum = 0, evenSum = 0;
		for (int i = 1; i <= MAX; i += 2) {
			oddSum += i;
		}
		for (int i = 0; i <= MAX; i += 2) {
			evenSum += i;
		}
		System.out.println(oddSum);
		System.out.println(evenSum);

	}

}
