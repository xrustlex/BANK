
package com.cogent.collections.demo;

import java.util.*;

/**
 * @author dick
 *
 * 6 окт. 2022 г.
 */

public class SwapListDemo {

	public static void main(String[] args) {

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
		Collections.swap(al, 3, 4);
		System.out.println("SWAPPED LIST:\t" + al);
		
	}

}
