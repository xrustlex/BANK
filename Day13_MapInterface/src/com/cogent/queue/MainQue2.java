/**
 * 
 */
package com.cogent.queue;

import java.util.*;

/**
 * @author dick
 *
 *         5 окт. 2022 г.
 */

class Employee implements Comparable {

	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee o1 = (Employee) o;
		return name.compareTo(o1.name);
	}

}

public class MainQue2 {
	/**
	 * Create a PriorityQueue and add Employee been data and perform following
	 * operations add peek offer ...etc for each
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Employee e = new Employee(991, "Adam", 26); Employee e = new Employee(992,
		 * "Boris", 27); Employee e = new Employee(993, "Chris", 28); Employee e = new
		 * Employee(994, "David", 29);
		 */
		PriorityQueue<Employee> pq = new PriorityQueue<Employee>();
		pq.add(new Employee(991, "Adam", 2));

	}

}
