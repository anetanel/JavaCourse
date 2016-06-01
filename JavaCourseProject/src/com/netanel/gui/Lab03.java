package com.netanel.gui;

import java.awt.*;
import javax.swing.*;


public class Lab03 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Blah");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setLocation(200, 200);
		//////////
		JPanel labelPanel = new JPanel(new BorderLayout());
		labelPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel checkBoxPanel = new JPanel();
		checkBoxPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel radioPanel = new JPanel();
		radioPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel radioAndCheckBoxPanel = new JPanel(new BorderLayout());
		radioAndCheckBoxPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel buttonsPanel = new JPanel();
		JPanel comboPanel = new JPanel();
		//////////
		
		JLabel label = new JLabel("Connection User Interface");
		labelPanel.add(label);
		/////////
		JCheckBox chk1 = new JCheckBox("Proxy");
		JCheckBox chk2 = new JCheckBox("Firewall");
		JCheckBox chk3 = new JCheckBox("SSL Enabled");
		
		checkBoxPanel.add(chk1);
		checkBoxPanel.add(chk2);
		checkBoxPanel.add(chk3);
		//////////
		JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Shared");
		JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Not Shared");
		
		radioPanel.add(radio1);
		radioPanel.add(radio2);
		/////////////
		
		radioAndCheckBoxPanel.add(checkBoxPanel);
		radioAndCheckBoxPanel.add(radioPanel);
		f.add(labelPanel, BorderLayout.NORTH);
		f.add(radioAndCheckBoxPanel, BorderLayout.WEST);
		
		
		f.pack();
		
		
	}
}
