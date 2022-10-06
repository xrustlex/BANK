
package com.cogent.innerclasses;

@FunctionalInterface
interface Drawable {
	
	public void draw();

}

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		int width = 10;

		//Lambda
		Drawable d2 = () -> {
			
			System.out.println("Drawing " + width);
			
		};
		
		d2.draw();
		
	}
}
