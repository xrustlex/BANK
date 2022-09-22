/**
 * 
 */
package com.cogent.operators;

/**
 * @author dick
 *
 * 21 сент. 2022 г.
 */
public class SwapTwoNumbersNoTemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10, b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + "  " + b);
	}

}
