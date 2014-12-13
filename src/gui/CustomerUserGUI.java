package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import project.Customers;

public class CustomerUserGUI extends JFrame {

	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	// constructor
	public CustomerUserGUI() {

		// frame properties

		mainFrame.setTitle("New Customer window 2");
		mainFrame.setSize(400, 400);
		mainFrame.setLocation(200, 100);
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainFrame.setVisible(true);

		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		mainFrame.add(mainPanel);
		mainPanel.add(panel);
		mainPanel.add(panel1);
		mainPanel.add(panel2);

		// Box description
		JLabel lblDescription = new JLabel();
		lblDescription.setText("Pick a user name and a password.");
		JLabel lblDescription1 = new JLabel();
		lblDescription1
				.setText("Create a security question in case you forget your password. ");

		lblDescription.setFont(new Font("Courier New", Font.ITALIC, 16));
		lblDescription1.setFont(new Font("Courier New", Font.ITALIC, 16));

		panel.add(lblDescription);
		panel.add(lblDescription1);

		// create labels and text fields
		JLabel lblUserName = new JLabel();
		JLabel lblPassword = new JLabel();
		JLabel lblSecurityA = new JLabel();
		JLabel lblSecurityQ = new JLabel();

		JTextField tfUserName = new JTextField("Enter your username");
		JTextField tfPassword = new JTextField("Enter your password");
		JTextField tfSecurityQ = new JTextField("Write your security question");
		JTextField tfSecurityA = new JTextField("write your security answer");

		lblUserName.setText("Choose user Name");
		lblPassword.setText("Choose your password");
		lblSecurityQ.setText("Questions goes here");
		lblSecurityA.setText("Answer goes here");

		tfUserName.getText();
		tfPassword.getText();
		tfSecurityQ.getText();
		tfSecurityA.getText();

		panel1.add(lblUserName);
		panel1.add(tfUserName);

		panel1.add(lblPassword);
		panel1.add(tfPassword);

		panel1.add(lblSecurityQ);
		panel1.add(tfSecurityQ);
		panel1.add(lblSecurityA);
		panel1.add(tfSecurityA);

		// Create a button with text Submit
		JButton jbtSubmit = new JButton("Submit");
		jbtSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					// code must create a new customer
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		// Create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");
		jbtCancel.addActionListener(null);
		jbtCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				mainFrame.dispose();
			}
		});
		// add the buttons to the panel
		panel2.add(jbtSubmit);
		panel2.add(jbtCancel);
	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CustomerUserGUI();
			}
		});
	}
}
