/**
 * 
 */
package com.cogent.doctor;

import java.util.Objects;

/**
 * @author dick
 *
 *         29 сент. 2022 г.
 */

class Doctor {

	private int drId;
	private double drSalary;
	private String drName;
	private String drSpec;

	public Doctor(int drId, double drSalary, String drName, String drSpec) {
		this.drId = drId;
		this.drSalary = drSalary;
		this.drName = drName;
		this.drSpec = drSpec;
	}

	@Override
	public String toString() {
		return "Doctor [drId = " + drId + ", drSalary = " + drSalary + ", drName = " + drName + ", drSpec = " + drSpec + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Doctor)) {
			return false;
		}
		Doctor other = (Doctor) obj;
		return drId == other.drId && Objects.equals(drName, other.drName)
				&& Double.doubleToLongBits(drSalary) == Double.doubleToLongBits(other.drSalary)
				&& Objects.equals(drSpec, other.drSpec);
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor dr1 = new Doctor(101, 100000.00, "Dre", "Music");
		Doctor dr2 = new Doctor(102, 99000.00, "Watson", "Cinema");
		Doctor dr3 = new Doctor(102, 99000.00, "Watson", "Cinema");
		Doctor dr4 = dr3;
		
		System.out.println(dr1.equals(dr2));
		System.out.println(dr3.equals(dr2));
		System.out.println(dr4.equals(dr3));
		System.out.println(dr4.equals(dr1));
		
		System.out.println();

		System.out.println(dr1.toString());
		System.out.println(dr2.toString());
		System.out.println(dr3.toString());
		System.out.println(dr4.toString());
	}

}
