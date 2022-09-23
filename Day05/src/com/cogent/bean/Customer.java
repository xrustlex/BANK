/**
 * 
 */
package com.cogent.bean;

/**
 * @author dick
 *
 *         23 сент. 2022 г.
 */
public class Customer {

	private int customerId;
	private int customerPnoneNumber;
	private String customerName;
	private String customerLocation;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCustomerPnoneNumber() {
		return customerPnoneNumber;
	}

	public void setCustomerPnoneNumber(int customerPnoneNumber) {
		this.customerPnoneNumber = customerPnoneNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLocation() {
		return customerLocation;
	}

	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}

}
