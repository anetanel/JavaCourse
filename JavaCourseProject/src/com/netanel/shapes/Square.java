package com.netanel.shapes;

public class Square extends Rectangle{
	//
	// Constructors
	//
	public Square(){}
	
	public Square (double side){
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled){
		super(side, side, color, filled);		
	}
	
	//
	// Functions
	//
	
	public double getSide(){
		return super.getWidth();
	}
	
	public void setSide(double side){
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public void setWidth(double side) {
		setSide(side);
	}
	
	@Override
	public void setLength(double side) {
		setSide(side);
	}
	
	@Override
	public String toString() {
		return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
	}
}
