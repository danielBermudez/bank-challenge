package com.bank.challenge.vista;

import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.bank.challenge.controller.Main;
import com.bank.challenge.oop.*;

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
	private ArrayList<Costumer> costumers ; 
	private ArrayList<Agent> agents;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//		
//		});
//	}
	public void run(Interface window) {
		try {
			
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Interface(ArrayList<Costumer> costumers, ArrayList<Agent> agents) {
		super();
		this.costumers = costumers;
		this.agents = agents;
		initialize();
		createEvents();
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
		createEvents();
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
		
		btnNewButton = new JButton("Clients");
		
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
	public void loadData(ArrayList<Costumer> costumers,ArrayList<Agent> agents) {
		this.costumers = costumers;
		this.agents= agents;
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
	public void createLabelClients2 (ArrayList<Costumer> costumers) {
		int numLabels = costumers.size();
		int x=160, y=40, width=80, height=16;
		JLabel[] jLabelAgent = new JLabel[numLabels];
		JLabel[] jLabelAgentStatus = new JLabel[numLabels];
		for (int i = 0; i < numLabels; i++, y+=20) {
			jLabelAgent[i] = new JLabel(costumers.get(i).getName());
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
	public void createEvents() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				createLabelClients((Integer) spinnerClients.getValue());
				
				createLabelClients2(costumers);
				
//				createLabelAgents(AgentsList.length);
			}
		});
	}
}
