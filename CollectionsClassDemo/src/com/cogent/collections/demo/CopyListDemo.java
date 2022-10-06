
package com.cogent.collections.demo;

import java.util.*;

/**
 * @author dick
 *
 *         6 окт. 2022 г.
 */

public class CopyListDemo {

	public static void main(String[] args) {

		List<Integer> al0 = new ArrayList<>();
		List<Integer> al1 = new ArrayList<>();

		al0.add(996);
		al0.add(997);
		al0.add(998);
		al0.add(999);

		al0.add(991);
		al0.add(992);
		al0.add(993);
		al0.add(994);
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		
		al1.add(7);
		al1.add(8);
		al1.add(9);
		al1.add(0);
		
		System.out.println("INITIAL LIST 1:\t" + al0);
		System.out.println("INITIAL LIST 2:\t" + al1);
		Collections.copy(al1, al0);
		System.out.println(" COPIED LIST 2:\t" + al1);

	}

}
