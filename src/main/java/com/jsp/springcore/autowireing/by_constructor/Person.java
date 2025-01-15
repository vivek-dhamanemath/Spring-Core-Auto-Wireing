package com.jsp.springcore.autowireing.by_constructor;

public class Person {

	private Bike bike;

	public Bike getBike() {
		return bike;
	}
	
	//Non parameterized const for object creation in case of setter injection
	public Person() {
		
	}

	//Setter method for the field to perform the setter injection
//	public void setBike(Bike bike) {
//		this.bike = bike;
//	}
	
	
	//Parameterized const with the required field in order to create object and perform const injection
	public Person(Bike bike) {
		super();
		this.bike = bike;
	}
	
	
}
