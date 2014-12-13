package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Logger;

import javax.swing.*;

import project.ConnectDB;
import project.Customers;

public class CustomerGUI extends JFrame {

	private static final long serialVersionUID = 100001L;
	JPanel panel = new JPanel();
	// JFrame mainFrame = new JFrame();
	JFrame frame = new JFrame(); // Create a frame

	public CustomerGUI() {

		// frame properties
		frame.setTitle("New Customer Window");
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		// changes the layout of frame
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		frame.add(panel); // Add the panel to the frame

		// Create a label with text "Enter your name: "
		JLabel jlblNameFirst = new JLabel("First Name: ");
		JLabel jlblNameLast = new JLabel("Last Name: ");
		JLabel jlblSSN = new JLabel("Social Security");
		JLabel jlblAddress = new JLabel("Address: ");
		JLabel jlblCityName = new JLabel("City Name: ");
		JLabel jlblStateName = new JLabel("State: ");
		JLabel jlblZIP = new JLabel("ZIP Code: ");

		// Create a text field with text "Type Name Here"
		final JTextField jtfNameFirst = new JTextField("Enter First Name");
		final JTextField jtfNameLast = new JTextField("Enter Last Name");
		final JTextField jtfSSN = new JTextField("Enter SSN");
		final JTextField jtfAddress = new JTextField("Enter Address");
		final JTextField jtfCityName = new JTextField("Enter City Name");
		final JTextField jtfStateName = new JTextField("Enter State Name");
		final JTextField jtfZIPcode = new JTextField("Enter ZIP Code");

		// Creates submits to the database and continues to the next form 
		// Create a button with text continue
		JButton jbtSubmit = new JButton("Continue");
		jbtSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {

			}
		});

		// Create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");
		jbtCancel.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
			frame.dispose();
				
			}
		}
);
		jbtCancel.setHorizontalTextPosition(SwingConstants.RIGHT);
		

		panel.add(jlblNameFirst);// Add the label to the panel
		panel.add(jtfNameFirst); // Add the text field to the panel

		panel.add(jlblNameLast);
		panel.add(jtfNameLast);

		panel.add(jlblSSN);
		panel.add(jtfSSN);
		
		panel.add(jlblAddress);
		panel.add(jtfAddress);

		panel.add(jlblCityName);
		panel.add(jtfCityName);

		panel.add(jlblStateName);
		panel.add(jtfStateName);

		panel.add(jlblZIP);
		panel.add(jtfZIPcode);

		panel.add(jbtSubmit); // Add the OK button to the panel
		panel.add(jbtCancel); // Add the Cancel button to the panel

	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CustomerGUI();
			}
		});
	}

}