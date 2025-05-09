package com.blc.elc;

public class BookMain {

	public static void main(String[] args) {
		Book  B=new Book();
		B.setBookDetails("Java Basics","John Doe",450.0);
		String result=B.getBookDetails();
		System.out.println(result);

	}

}
