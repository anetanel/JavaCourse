package com.netanel.gui;

import java.awt.*;
import javax.swing.*;

public class Lab02 {
	public static void main(String[] args) {
		JFrame f1 = new JFrame("My first Swing frame");
		JFrame f2 = new JFrame("My 2nd Swing frame");
		JFrame f3 = new JFrame("My 3rd Swing frame");
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f1.setVisible(true);
		f1.setSize(400, 200);
		f1.setLocation(200, 200);
		
		f2.setVisible(true);
		f2.setSize(400, 200);
		f2.setLocation(800, 200);
		
		f3.setVisible(true);
		f3.setSize(400, 200);
		f3.setLocation(1300, 200);
		
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		JButton btn4 = new JButton("btn4");
		JButton btn5 = new JButton("btn5");
		JButton btn6 = new JButton("btn6");
		JButton btn7 = new JButton("btn7");
		JButton btn8 = new JButton("btn8");
		JButton btn9 = new JButton("btn9");
		JButton btn10 = new JButton("btn10");
		JButton btn11 = new JButton("btn11");
		JButton btn12 = new JButton("btn12");
		JButton btn13 = new JButton("btn13");
		JButton btn14 = new JButton("btn14");
		btn1.setFont(new Font("Arial", Font.BOLD, 25));
		btn2.setFont(new Font("Arial", Font.BOLD, 25));
		btn3.setFont(new Font("Arial", Font.BOLD, 25));
		btn4.setFont(new Font("Arial", Font.BOLD, 25));
		btn5.setFont(new Font("Arial", Font.BOLD, 25));
		btn6.setFont(new Font("Arial", Font.BOLD, 25));
		btn7.setFont(new Font("Arial", Font.BOLD, 25));
		btn8.setFont(new Font("Arial", Font.BOLD, 25));
		btn9.setFont(new Font("Arial", Font.BOLD, 25));
		btn10.setFont(new Font("Arial", Font.BOLD, 25));
		btn11.setFont(new Font("Arial", Font.BOLD, 25));
		btn12.setFont(new Font("Arial", Font.BOLD, 25));
		btn13.setFont(new Font("Arial", Font.BOLD, 25));
		btn14.setFont(new Font("Arial", Font.BOLD, 25));
		
		JPanel p1 = new JPanel();
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(btn4, BorderLayout.NORTH);
		p2.add(btn5, BorderLayout.SOUTH);
		p2.add(btn6, BorderLayout.WEST);
		p2.add(btn7, BorderLayout.EAST);
		p2.add(btn8, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel(new GridLayout(2,3,5,5));
		p3.add(btn9);
		p3.add(btn10);
		p3.add(btn11);
		p3.add(btn12);
		p3.add(btn13);
		p3.add(btn14);
		
				
		f1.add(p1);
		f2.add(p2);
		f3.add(p3);
		//f3.pack();
	}
}
