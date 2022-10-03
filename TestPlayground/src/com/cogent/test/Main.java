
package com.cogent.test;

import java.util.Arrays;

public class Main {
	
	static int[] arr = {1, 4, 3, 2, 8, 7, 9, 0, 6, 5, 5, 44, -11, 3498};
	public static void main (String[] s) {
		
		Arrays.sort(arr);
		for (int e: arr)
		System.out.print(e+" ");
		
	}

}
