package com.example.java.fundamentals.model.object;

public class App {

	public static void main(String[] args) {
		Person person = new Person();
		person.setDocument("01234567890");
		person.setName("Mark Seller");
		
		System.out.println("Document: " + person.getDocument());
		System.out.println("Name: " + person.getName());
	}
	
}
