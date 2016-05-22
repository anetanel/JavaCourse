package com.netanel.date;

public class TestMyDate {
	public static void main(String[] args) {
		MyDate d1 = new MyDate(2011, 12, 28);
		
		while (!(d1.getDay() == 15 && d1.getMonth() == 3)) 
		{
			System.out.println(d1.nextDay());
		}
	}
}
