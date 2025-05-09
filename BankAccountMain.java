package com.blc.elc;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount bank=new BankAccount();
		bank.setAccountDetails("Rahul",123456,5000.0);
		String result=bank.getBookDetails();
		System.out.println(result);
		

	}

}
