/**
 * 
 */
package com.cogent.collections.demo;

import java.util.*;

/**
 * @author dick
 *
 *         6 окт. 2022 г.
 */
public class MinMaxListDemo {

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

		System.out.println("INITIAL LIST:\t" + al);
		int min = Collections.min(al);
		System.out.println(" MIN IN LIST:\t" + min);
		int max = Collections.max(al);
		System.out.println(" MIN IN LIST:\t" + max);

	}

}
