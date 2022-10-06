/**
 * 
 */
package com.cogent.innerclasses;

/**
 * @author dick
 *
 *         6 окт. 2022 г.
 */

interface Hello {

	String greet(String name);

}

public class MainHello implements Hello {

	/**
	 * @param args
	 */

	void doStuff() {
		;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String greet (String name) {
		// TODO Auto-generated method stub
		return "Hello" + name;
	}

}
