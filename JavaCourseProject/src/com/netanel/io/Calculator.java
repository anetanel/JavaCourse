package com.netanel.io;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("First number:");
		int num1 = sc.nextInt();
		System.out.println("Second number:");
		int num2 = sc.nextInt();
		System.out.println("Operation:");
		String opr = sc.next();
		sc.close();
		if (opr.equals("+")) {
			result = num1 + num2;
		} else if (opr.equals("-")) {
			result = num1 - num2;
		} else if (opr.equals("/")) {
			result = num1 / num2;
		} else if (opr.equals("*")) {
			result = num1 * num2;
		} else {
			throw new ArithmeticException("Invalid operand!");
		}

		System.out.println(num1 + opr + num2 + "=" + result);

	}
}
