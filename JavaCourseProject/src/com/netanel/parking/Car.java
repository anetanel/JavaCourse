package com.netanel.parking;

public class Car extends Vehicle {
	//
	// Constructors
	//
	public Car(int model){
		super(model);
	}
	
	public Car(int model, String color, int maxVelocity) {
		super(model, color, maxVelocity);
	}


	//
	// toString
	//
	@Override
	public String toString() {
		return "A Car, which is " + super.toString();	
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car)) {
			return false;
		}
		
		Car other = (Car)obj;
		return (getColor() == other.getColor() &&
				getMaxVelocity() == other.getMaxVelocity() &&
				getModel() == other.getModel());				
	}
}
