package com.netanel.shapes;

public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		Shape s2 = new Shape("blue", false);
		
		System.out.println(s1);
		System.out.println(s2);
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(3.4, "yellow", false);
		
		System.out.println(c1);
		System.out.println(c2);
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10,5.5,"brown", false);
		
		System.out.println(r1);
		System.out.println(r2);
		
		Square sq1 = new Square();
		Square sq2 = new Square(20.5);
		Square sq3 = new Square(15.3,"pink", true);
		
		System.out.println(sq1);
		System.out.println(sq2);
		System.out.println(sq3);
		
	}
}
