package com.netanel.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab04 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab04 frame = new Lab04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lab04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 20, 2));
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Celsius");
		lblCelsius.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblCelsius);
		
		JLabel lblFarenheit = new JLabel("---");
		
		JButton btn1 = new JButton("Convert");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double farenheit =  Double.parseDouble(textField.getText()) * 1.8 + 32;
				lblFarenheit.setText(String.format("%.1f", farenheit) + "° Farenheit");
			}
		});
		contentPane.add(btn1);
		
		
		lblFarenheit.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblFarenheit);
	}

}
