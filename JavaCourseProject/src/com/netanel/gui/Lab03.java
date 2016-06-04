package com.netanel.gui;

import java.awt.*;
import javax.swing.*;


public class Lab03 {
	public static void main(String[] args) {
		// Create Frame
		JFrame f = new JFrame("Connection User Interface");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setLocation(200, 200);
		// Create Panels 
		JPanel labelPanel = new JPanel(new BorderLayout());
		JPanel checkBoxPanel = new JPanel(new GridLayout(3,1));
		JPanel radioPanel = new JPanel(new GridLayout(3, 1));
		JPanel radioAndCheckBoxPanel = new JPanel(new BorderLayout());
		JPanel buttonsPanel = new JPanel(new GridLayout(3, 1));
		JPanel comboPanel = new JPanel();

		// Top Label		
		JLabel label = new JLabel("Connection User Interface");
		label.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 25));
		labelPanel.add(label, BorderLayout.WEST);
		// Check-boxes
		JCheckBox chk1 = new JCheckBox("Proxy");
		JCheckBox chk2 = new JCheckBox("Firewall");
		JCheckBox chk3 = new JCheckBox("SSL Enabled");
		
		chk1.setToolTipText("Enable Proxy");
		chk2.setToolTipText("Enable Firewall");
		chk3.setToolTipText("Enable SSL");
		
		checkBoxPanel.add(chk1);
		checkBoxPanel.add(chk2);
		checkBoxPanel.add(chk3);
		// Radio Buttons
		JLabel radioLabel = new JLabel("Files");
		JRadioButton radio1 = new JRadioButton("Shared");
		JRadioButton radio2 = new JRadioButton("Not Shared");
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(radio1);
		radioGroup.add(radio2);
		
		radio1.setToolTipText("Share Files");
		radio2.setToolTipText("Do Not Share Files");
		
		radioPanel.add(radioLabel);
		radioPanel.add(radio1);
		radioPanel.add(radio2);
		// Buttons
		Icon connectedIcon = new ImageIcon("files/icons/connected.png");
		Icon disconnectedIcon = new ImageIcon("files/icons/disconnected.png");
		Icon awayIcon = new ImageIcon("files/icons/away.png");
		
		JButton btnConnect = new JButton("Connect", connectedIcon);
		JButton btnDisconnect = new JButton("Disconnect", disconnectedIcon);
		JButton btnAway = new JButton("Away", awayIcon);
		
		btnConnect.setToolTipText("Connect");
		btnConnect.setHorizontalAlignment(SwingConstants.LEFT);
		btnDisconnect.setToolTipText("Disconnect");
		btnDisconnect.setHorizontalAlignment(SwingConstants.LEFT);
		btnAway.setToolTipText("Away");
		btnAway.setHorizontalAlignment(SwingConstants.LEFT);
		
		buttonsPanel.add(btnConnect);
		buttonsPanel.add(btnDisconnect);
		buttonsPanel.add(btnAway);
		// Combo Box
		JLabel comboLabel = new JLabel("Choose User");
		String[] comboStr = {"User1", "User2", "User3"};
		JComboBox<String> combo = new JComboBox<>(comboStr);
		
		comboPanel.add(comboLabel);
		comboPanel.add(combo);
		
		// Add all Panels to Frame
		radioAndCheckBoxPanel.add(checkBoxPanel, BorderLayout.NORTH);
		radioAndCheckBoxPanel.add(radioPanel, BorderLayout.SOUTH);
		f.add(labelPanel, BorderLayout.NORTH);
		f.add(radioAndCheckBoxPanel, BorderLayout.WEST);
		f.add(buttonsPanel, BorderLayout.CENTER);
		f.add(comboPanel, BorderLayout.EAST);
				
		f.pack();		
	}
}
