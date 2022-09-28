/**
 * 
 */
package com.cogent.interfsces;

/**
 * @author dick
 *
 *         27 сент. 2022 г.
 */
public interface Intrfc {
	public default void test() {
		System.out.println("Xyu");
	}
}

class Main implements Intrfc {

	public void test() {

	}
}
       