package com.netanel.gui;


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
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;


public class Lab04 extends JFrame {

	//
	// Attributes
	//
	private JPanel contentPane;
	private JTextField txtEnterNumber;
	private boolean firstClick = true;
	private JButton btn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab04 frame = new Lab04();
					frame.setVisible(true);
					frame.btn1.requestFocusInWindow();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lab04() {
		// Frame settings
		setResizable(false);
		setTitle("Celsius to Farenheit Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 100);
		// Main Panel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 20, 2));
		// Text Area
		txtEnterNumber = new JTextField();
		txtEnterNumber.setForeground(Color.LIGHT_GRAY);
		txtEnterNumber.setText("Enter number...");
		contentPane.add(txtEnterNumber);
		txtEnterNumber.setColumns(10);
		txtEnterNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Clear text area on first mouse click
				if (firstClick) {
					txtEnterNumber.setText(null);
					txtEnterNumber.setForeground(Color.BLACK);
					firstClick = false;
				}
				
			}
		});
		// Celsius Label
		JLabel lblCelsius = new JLabel("Celsius");
		lblCelsius.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblCelsius);
		// Farenheit Label is declared here to be used in the button action
		JLabel lblFarenheit = new JLabel("---");
		// Button
		btn1 = new JButton("Convert");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double farenheit =  Double.parseDouble(txtEnterNumber.getText()) * 1.8 + 32;
				lblFarenheit.setText(String.format("%.1f", farenheit) + "° Farenheit");
				} catch (Exception e2){
					JOptionPane.showMessageDialog(Lab04.this, "You must enter a number!", "Warning!", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		contentPane.add(btn1);
		// Add Farenheit Label 	
		lblFarenheit.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblFarenheit);
	}

}
