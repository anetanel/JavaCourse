package com.netanel.complex;

public class TestMyComplex {
	public static void main(String[] args) {
		MyComplex c1 = new MyComplex(10, 5);
		MyComplex c2 = new MyComplex(12, 3);
		MyComplex c3 = new MyComplex(1, 1);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		c1.subtract(c2);
		System.out.println(c1);
		c1.add(c3);
		System.out.println(c1);
		
		System.out.println(c1.conjugate());
		System.out.println(c1.conjugate());
		
	}
}
