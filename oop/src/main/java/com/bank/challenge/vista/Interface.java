package com.bank.challenge.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frame;
	private JLayeredPane layeredPane;
	private JLabel labelStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(6, 6, 438, 266);
		frame.getContentPane().add(layeredPane);
		
		labelStatus = new JLabel("");
		labelStatus.setOpaque(true);
		labelStatus.setBackground(Color.YELLOW);
		labelStatus.setBounds(6, 10, 16, 16);
		layeredPane.add(labelStatus);
		
		JButton btnStatus = new JButton("status");
		btnStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (getRandomIntegerBetweenRange(0,2)) {
				case 0:
					labelStatus.setBackground(Color.yellow);
					break;
				case 1:
					labelStatus.setBackground(Color.green);
					break;
				case 2:
					labelStatus.setBackground(Color.red);
					break;
					default:
						break;
				}
			}
		});
		btnStatus.setBounds(34, 6, 83, 29);
		layeredPane.add(btnStatus);
	}
	public static int getRandomIntegerBetweenRange(int min, int max){
	    double x = (int)(Math.random()*((max-min)+1))+min;
	    return (int) x;
	}

}
