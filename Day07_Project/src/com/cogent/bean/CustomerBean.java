/**
 * 
 */
package com.cogent.bean;

/**
 * @author dick
 *
 *         26 сент. 2022 г.
 */
public class CustomerBean {

	public long getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	private long customerId;
	private String customerName;

	/**
	 * @param customerId
	 * @param customerName
	 */
	public CustomerBean(long customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

}
