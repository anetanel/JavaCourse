package com.netanel.shapes;

public class Circle extends Shape{
	//
	// Attributes
	//
	private double radius = 1.0;
	
	//
	//Constructors
	//
	public Circle(){
		super();
		this.radius = 1.0;
	}
	
	public Circle(double radius){
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled ){
		super(color, filled);
		this.radius = radius;
	}

	//
	// Getters
	//
	public double getRadius() {
		return radius;
	}

	//
	// Setters
	//
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//
	// Methods
	//
	
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
	}
	
	
}
