package com.boxingandautoboxing;

import java.util.ArrayList;

public class Branches {
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	private int addnTrnsction;
	
	public Branches(ArrayList<Customer> customerList, int addnTrnsction) {
		this.customerList = customerList;
		this.addnTrnsction = addnTrnsction;
	}
	
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	
	public int getAddnTrnsction() {
		return addnTrnsction;
	}


}
