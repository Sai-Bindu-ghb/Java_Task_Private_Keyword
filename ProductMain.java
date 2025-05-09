package com.blc.elc;

public class ProductMain {

	public static void main(String[] args) {
		Product p=new Product();
		p.setProductDetails("Laptop",501,75000.0);
		String result=p.getProductDetails();
		System.out.println(result);
	}

}
