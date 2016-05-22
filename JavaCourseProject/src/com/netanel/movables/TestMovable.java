package com.netanel.movables;

public class TestMovable {
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 6, 10, 4);     // upcast
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		   
		Movable m2 = new MovableCircle(2, 1, 2, 20, 60); // upcast
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
		Movable m3 = new MovableRectangle(0, 5, 8, 0, 1, 1);
		System.out.println(m3);
		m3.moveUp();
		System.out.println(m3);
	}
}
