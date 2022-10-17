/**
 * 
 */
package com.cogent.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dick
 *
 * 17 окт. 2022 г.
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*JAVA WAY
		Car myCar = new Car();
		myCar.getEngine();
		*/
		// SPRING WAY
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car myCar = context.getBean(Car.class);
		myCar.drive();
		
	}

}
