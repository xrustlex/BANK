/**
 * 
 */
package com.cogent.repo;

import com.cogent.bean.CustomerBean;
import com.cogent.bean.CustomerBean;

/**
 * @author dick
 *
 *         26 сент. 2022 г.
 */
public class CustomerRepo {
	
	int size = 1;
	CustomerBean[] custArr = new CustomerBean[256];

	public CustomerRepo() {
		// TODO Auto-generated constructor stub

	}

	public void addCustomer(CustomerBean customerBean) {
		custArr[size-1] = customerBean;
		size++;
	}

}
