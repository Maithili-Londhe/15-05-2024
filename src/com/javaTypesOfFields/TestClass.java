package com.javaTypesOfFields;

public class TestClass {

	public static void main(String[] args) {

		System.out.println("---------------------non-static methods needs object creation--------------------");		

		Employee employee1 = new Employee(110, "Meena", "Software Engineer", 75839.45);
		employee1.getEmployee();

		System.out.println("-----------------------------------------------");		

		Employee employee2 = new Employee(112, "Ajay Kumar", "Software Developer", 90876.45);
		employee2.getEmployee();

		System.out.println("---------------------static methods no need object creation--------------------");		

		//Employee.countryName = "USA";
		Employee.getEmployeeCountryName();
		
	}

}
