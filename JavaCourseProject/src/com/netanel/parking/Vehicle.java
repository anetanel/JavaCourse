package com.netanel.parking;

public abstract class Vehicle extends Transport{
	//
	// Attributes
	//
	private int model;
	
	//
	// Constructors
	//
	public Vehicle(int model){
		super();
		this.model = model;
	}
	
	public Vehicle(int model, String color, int maxVelocity) {
		super(color, maxVelocity);
		this.model = model;
	}
	
	//
	// Getters
	//
	public int getModel() {
		return model;
	}

	//
	// toString
	//
	@Override
	public String toString() {
		return "a Vehicle model " + model + ". Is " + super.toString();
	}
	
}
