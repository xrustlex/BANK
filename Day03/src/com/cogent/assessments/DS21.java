/**
 * 
 */
package com.cogent.assessments;

/**
 * @author dick
 *
 * 21 сент. 2022 г.
 */
public class DS21 {

	/**
	 * @param args
	 */
	final static int NUM = 97;
	public static void main(String[] args) {
		
	    int num = NUM;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");		
	}

}
