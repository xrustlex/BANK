package com.cogent.innerclasses;
/**
 * @author dick
 *
 * 6 окт. 2022 г.
 */

interface Mainable {
	
	void show();

	static void display() {
		
		System.out.println("DISPLAY");
		
	}
	
	default void view() {
		
		System.out.println("VIEW");
		
	}
}

class Main {
	
	public static void main(String[] s) {
		
		Mainable.display();
		
	}
}