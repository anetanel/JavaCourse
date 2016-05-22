package com.netanel.shapes;

public class Shape {
	
	//
	// Attributes
	//
	private String color = "red";
	private boolean filled = true;
	
	//
	// Constructors
	//
	public Shape() {
		color = "green";
		filled = true;
	}
	
	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	//
	// Getters
	//
	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return filled;
	}

	//
	// Setters
	//
	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	//
	// toString
	//
	@Override
	public String toString() {
		String strFilled = "not filled";
		if (filled) strFilled = "filled";
		return "A Shape with color of " + color + " and " + strFilled ;
	}
	
}
