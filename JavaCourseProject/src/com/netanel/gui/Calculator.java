package com.netanel.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JLabel display;
	private double result = 0;
	private boolean clearScreen = false;
	private String operation;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setResizable(false);
		ButtonListener listner = new ButtonListener();
		String displayStr = "0";
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 220, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel topPanel = new JPanel();
		contentPane.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BorderLayout(0, 0));

		display = new JLabel(displayStr);
		display.setFont(new Font("Arial", Font.BOLD, 14));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBorder(new LineBorder(new Color(0, 0, 0)));
		display.setOpaque(true);
		display.setBackground(Color.WHITE);
		topPanel.add(display, BorderLayout.CENTER);

		JButton btnClear = new JButton("C");
		btnClear.setToolTipText("Clear");
		topPanel.add(btnClear, BorderLayout.EAST);
		btnClear.addActionListener(listner);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 4, 4, 4));

		JButton btn7 = new JButton("7");
		panel.add(btn7);
		btn7.addActionListener(listner);

		JButton btn8 = new JButton("8");
		panel.add(btn8);
		btn8.addActionListener(listner);

		JButton btn9 = new JButton("9");
		panel.add(btn9);
		btn9.addActionListener(listner);

		JButton btnDevide = new JButton("/");
		panel.add(btnDevide);
		btnDevide.addActionListener(listner);

		JButton btn4 = new JButton("4");
		panel.add(btn4);
		btn4.addActionListener(listner);

		JButton btn5 = new JButton("5");
		panel.add(btn5);
		btn5.addActionListener(listner);

		JButton btn6 = new JButton("6");
		panel.add(btn6);
		btn6.addActionListener(listner);

		JButton btnMultiply = new JButton("*");
		panel.add(btnMultiply);
		btnMultiply.addActionListener(listner);

		JButton btn1 = new JButton("1");
		panel.add(btn1);
		btn1.addActionListener(listner);

		JButton btn2 = new JButton("2");
		panel.add(btn2);
		btn2.addActionListener(listner);

		JButton btn3 = new JButton("3");
		panel.add(btn3);
		btn3.addActionListener(listner);

		JButton btnMinus = new JButton("-");
		panel.add(btnMinus);
		btnMinus.addActionListener(listner);

		JButton btn0 = new JButton("0");
		panel.add(btn0);
		btn0.addActionListener(listner);

		JButton btnBtnperiod = new JButton(".");
		panel.add(btnBtnperiod);
		btnBtnperiod.addActionListener(listner);

		JButton btnEquals = new JButton("=");
		panel.add(btnEquals);
		btnEquals.addActionListener(listner);

		JButton btnPlus = new JButton("+");
		panel.add(btnPlus);
		btnPlus.addActionListener(listner);

	}

	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String btnStr = ((JButton) e.getSource()).getText();
			if (btnStr.matches("[0-9]")) {
				if (clearScreen) {
					display.setText("");
				}
				if (display.getText().equals("0")) {
					display.setText("");
				}
					display.setText(display.getText() + btnStr);
			} else if (btnStr.matches("[+-/*]")) {
				result = Double.parseDouble(display.getText());
				operation = btnStr;
				clearScreen = true;
			} else if (btnStr.equals("=")) {
				switch (operation){
				case "+":
					result = result + Double.parseDouble(display.getText());
					break;
				}
				display.setText(Double.toString(result));
			}

		}
	}
}
