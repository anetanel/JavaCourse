package com.netanel.parking;

public class Transport {
	//
	// Attributes
	//
	private String color = "Undefined";
	private int maxVelocity;
	
	//
	// Constructors
	//
	public Transport() {
	}
	
	public Transport(String color, int maxVelocity){
		this.color = color;
		this.maxVelocity = maxVelocity;
	}
	
	//
	// Getters
	//
	public String getColor() {
		return color;
	}
	
	public int getMaxVelocity() {
		return maxVelocity;
	}
	
	//
	// Setters
	//
	public void setColor(String color) {
		this.color = color;
	}
	
	//
	// toString
	//
	@Override
	public String toString() {
		return "a Transport with color " + color + " and MaxVelocity " + maxVelocity;
	}
}
