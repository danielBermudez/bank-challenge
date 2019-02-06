package com.bank.challenge.vista;

import java.util.*;
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
import javax.swing.JRadioButton;
import javax.swing.JSpinner;

public class Interface {

	private JFrame frame;
	private JLayeredPane layeredPane;
	private JButton btnCreateLabels;
	String[] AgentsList = {"Cashier 1","Cashier 2","Cashier 3","Cashier 4","Supervisor 1","Supervisor 2","Director"};
	private JSpinner spinnerClients;


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
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(6, 6, 438, 566);
		frame.getContentPane().add(layeredPane);
		
		btnCreateLabels = new JButton("Dispatcher");
		btnCreateLabels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				createLabel(AgentsList.length);
			}
		});
		btnCreateLabels.setBounds(315, 6, 117, 29);
		layeredPane.add(btnCreateLabels);
		
		spinnerClients = new JSpinner();
		layeredPane.setLayer(spinnerClients, 0);
		spinnerClients.setBounds(123, 6, 51, 26);
		layeredPane.add(spinnerClients);
		
		JButton btnNewButton = new JButton("Clients");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createLabelClients((Integer) spinnerClients.getValue());
				createLabelAgents(AgentsList.length);
			}
		});
		btnNewButton.setBounds(186, 6, 117, 29);
		layeredPane.add(btnNewButton);
	
	} 
	
	public void createLabelAgents (int numLabels) {
		int x=30, y=40, width=80, height=16;
		JLabel[] jLabelAgent = new JLabel[numLabels];
		JLabel[] jLabelAgentStatus = new JLabel[numLabels];
		for (int i = 0; i < numLabels; i++, y+=20) {
			jLabelAgent[i] = new JLabel(AgentsList[i]);
			jLabelAgentStatus[i] = new JLabel(""); 
			jLabelAgent[i].setBounds(x, y, width, height);
			jLabelAgentStatus[i].setBounds(x-20, y, 16, 16);
			jLabelAgentStatus[i].setOpaque(true);
			jLabelAgentStatus[i].setBackground(Color.red);
			layeredPane.add(jLabelAgent[i]);
			layeredPane.add(jLabelAgentStatus[i]);
		}
	}
	public void createLabelClients (int numLabels) {
		int x=160, y=40, width=80, height=16;
		JLabel[] jLabelAgent = new JLabel[numLabels];
		JLabel[] jLabelAgentStatus = new JLabel[numLabels];
		for (int i = 0; i < numLabels; i++, y+=20) {
			jLabelAgent[i] = new JLabel("Client "+i);
			jLabelAgentStatus[i] = new JLabel(""); 
			jLabelAgent[i].setBounds(x, y, width, height);
			jLabelAgentStatus[i].setBounds(x-20, y, 16, 16);
			jLabelAgentStatus[i].setOpaque(true);
			jLabelAgentStatus[i].setBackground(Color.red);
			layeredPane.add(jLabelAgent[i]);
			layeredPane.add(jLabelAgentStatus[i]);
		}
	}
	
	public static int getRandomIntegerBetweenRange(int min, int max){
	    double x = (int)(Math.random()*((max-min)+1))+min;
	    return (int) x;
	}
}
