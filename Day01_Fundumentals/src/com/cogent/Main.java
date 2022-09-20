package com.cogent;

/*
 * @author 		Vadim KURILKO
 * @date		
 * @description	
 */
public class Main {
	public static void main(String[] args) {
		// entry point
		anotherClass.anotherStaticMethod();
		new anotherClass().anotherNonStaticMethod();
		oneClass.oneStaticMethod();
		new oneClass().oneNonStaticMethod();
		new Car().start();
	}
}

abstract class Vehicle {
	abstract void start();
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Starting Car");
	}
}

class Boat extends Vehicle {
	@Override
	void start() {
		System.out.println("Starting Boat");
	}
}

class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Starting Boat");
	}
}