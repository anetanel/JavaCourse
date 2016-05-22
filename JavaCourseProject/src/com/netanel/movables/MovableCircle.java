package com.netanel.movables;

public class MovableCircle implements Movable {
	
	//
	// Attributes
	//
	public int radius;
	public MovablePoint center;

	//
	// Constructors
	//
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x,y,xSpeed,ySpeed);
		this.radius = radius;
	}
	@Override
	public void moveUp() {
		center.moveUp();
	}

	@Override
	public void moveDown() {
		center.moveDown();
	}

	@Override
	public void moveLeft() {
		center.moveLeft();
	}

	@Override
	public void moveRight() {
		center.moveRight();
	}
	
	@Override
	public String toString() {
	return center + " r: " + radius;
	}

}
