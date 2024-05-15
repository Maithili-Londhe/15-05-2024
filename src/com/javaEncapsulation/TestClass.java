package com.javaEncapsulation;

public class TestClass extends Product
{

	public static void main(String[] args) {

		Product product1 = new Product(2200, "Lenovo laptop T460s", 89504.34);
		System.out.println(product1.getProductId());	//The field Product.productId is not visible
	
		System.out.println("--------------");	//The field Product.productId is not visible
		product1.setProductId(9900);
		System.out.println(product1.getProductId());	//The field Product.productId is not visible
		
		
		
	}

}
