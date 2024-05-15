package com.javaInstanceOfOperator;


public class Customer 
{
	//fields
	private int customerId;
	private String customerName;
	private long customerContactNo;
	private String customerAddress;
	
	/**
	 * if any constructor is not declared by a programmer then the compiler will provides a default/
	 * zero-parameterized constructor in class.	
	 */
	public Customer()
	{
		//to initialize an object(state), we use constructor.
		customerId = 101;
		customerName = "Anitha";
		customerContactNo = 9023451234l;
		customerAddress = "Pune";
	}
	
	public void getCustomer()
	{
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerContactNo);
		System.out.println(customerAddress);
	}
	
}
