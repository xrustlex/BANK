
package com.cogent.test;

import java.util.*;

public class Main {

	public static void main(String[] s) {

		String a1 = "111";
		String a2 = new String("111");
		String a3 = "111";
		String a4 = new String("111");

		String forS = "";
		String revS = "";
		
		Scanner scan = new Scanner(System.in);
		forS = scan.nextLine();
		
		for (int i = forS.length() - 1; i >= 0; i--)
			revS += forS.charAt(i);

		//System.out.println(forS);
		System.out.println(revS);

	}

}
