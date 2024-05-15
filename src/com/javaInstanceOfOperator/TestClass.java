package com.javaInstanceOfOperator;

public class TestClass {

	public static void main(String[] args) 
	{
		
		Customer customer1 = new Customer();
		customer1.getCustomer();
		
		System.out.println("------------------------------");
		
		Student student1 = new Student();
		
		System.out.println("------------------------------");
		
		System.out.println(student1 instanceof Student);
		
	}

}
