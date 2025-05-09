package com.blc.elc;

public class CarMain {

	public static void main(String[] args) {
		Car c=new Car();
		c.setCarDetails("Swift","Maruti",600000.0);
		String result=c.getBookDetails();
		System.out.println(result);

	}

}
