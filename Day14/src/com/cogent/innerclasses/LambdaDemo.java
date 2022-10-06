
package com.cogent.innerclasses;

@FunctionalInterface
interface Drawable {
	
	public int draw(int x);

}

public class LambdaDemo {
	
	public static void main(String[] args) {

		//Lambda
		Drawable d2 = (x) -> 10*x;
		
		System.out.println(d2.draw(10));
		
	}
}
