package com.cogent.spring.core;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
/**
 * @author dick
 *
 * 17 окт. 2022 г.
 */
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext (SpringConfig.class);
		Printer printer = context.getBean(Printer.class);
		
		Printer myPrinter = new Printer();
		myPrinter.print();
		
	}

}
          