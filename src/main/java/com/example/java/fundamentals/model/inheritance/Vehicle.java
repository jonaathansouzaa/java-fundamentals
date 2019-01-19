package com.example.java.fundamentals.model.inheritance;

public class Vehicle {

	public Integer numberOfSeats = 5;

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public Vehicle() {
		
	}
	
	public Vehicle(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
}
