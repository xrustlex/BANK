/**
 * 
 */
package com.cogent.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dick
 *
 *         6 окт. 2022 г.
 */
public class FrequencyInListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<>();

		al.add(996);
		al.add(997);
		al.add(998);
		al.add(999);

		al.add(991);
		al.add(992);
		al.add(993);
		al.add(994);

		int n = 999;
		int f = Collections.frequency(al, n);
		System.out.println("INITIAL LIST:\t" + al);
		System.out.println("FREQUENCY OF " + n + " IN LIST:\t" + f);
		
		al.add(999);
		al.add(999);
		al.add(999);

		f = Collections.frequency(al, n);
		System.out.println("FREQUENCY OF " + n + " IN LIST:\t" + f);
		
	}

}
