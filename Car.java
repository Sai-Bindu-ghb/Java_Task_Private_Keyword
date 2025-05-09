package com.blc.elc;

public class Car {
	private String model;
	private String company;
	private double price;
	public void setCarDetails(String m, String c, double p)
	{
		model=m;
		company=c;
		price=p;	
	}
	public String getBookDetails()
	{
		return "Car Model:"+model +"\nCompany:"+company +"\nCar Price:"+price;
	}

}
