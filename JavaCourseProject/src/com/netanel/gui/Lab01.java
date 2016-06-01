package com.netanel.gui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Lab01 {
	public static void main(String[] args) {
		JFrame f = new JFrame("My first Swing frame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setSize(400, 200);
		f.setLocation(200, 200);
		
		JButton btn1 = new JButton("My Button");
		btn1.setFont(new Font("Arial", Font.BOLD, 25));
		f.add(btn1);
	}
}
