package com.javaTypesOfFields;

public class Employee {
	
	//fields
	
	//non-static fields
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private double employeeSalary;
	
	//static fields
	public static String countryName;
	
	//static block
	static
	{
		countryName = "Bharat";
	}
	
	
	/**
	 * static keyword: we use static keyword for better/efficient memory management in java.
	 * 
	 * we static keyword, to declare fields, methods and blocks 
	 * 
	 * Note: we learn more about static in coming sessions.
	 * 
	 */
	
	//default/zero-parameterized constructor
	public Employee()
	{

	}
	
	/**
	 * this keyword: when non-static fields names and constructor/method parameter names
	 *               are same, then we use 'this' keyword to differentiate non-static fields
	 *               from constructor/method parameters.
	 * 
	 * Note: this keyword we use to point the current class properties.
	 * 
	 */
	public Employee(int employeeId, String employeeName, String employeeDesignation, double employeeSalary)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}
	
	//non-static method
	public void getEmployee()
	{
		System.out.println(this.employeeId);
		System.out.println(this.employeeName);
		System.out.println(this.employeeDesignation);
		System.out.println(this.employeeSalary);		
	}
	
	//static method
	public static void getEmployeeCountryName()
	{
		System.out.println(countryName);	
	}
	
}
