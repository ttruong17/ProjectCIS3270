package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Logger;
import javax.swing.*;

import project.ConnectDB;

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

		
		 // Add the panel to the frame
		frame.add(panel);
		
		// Create a label with text "Enter your name: "
	
		JLabel jlblNameFirst = new JLabel("First Name: ");
		JLabel jlblNameLast = new JLabel("Last Name: ");
		JLabel jlblAddress = new JLabel("Address: ");
		JLabel jlblCityName = new JLabel("City Name: ");
		JLabel jlblZIP = new JLabel("ZIP Code: ");
		JLabel jlblSSN = new JLabel("SSN: ");
		JLabel lblUserName = new JLabel();
		JLabel lblPassword = new JLabel();
		JLabel lblSecurityA = new JLabel();
		JLabel lblSecurityQ = new JLabel();

		JTextField tfUserName = new JTextField("Enter your username");
		JTextField tfPassword = new JTextField("Enter your password");
		JTextField tfSecurityQ = new JTextField("What's your favorite Color?");
		JTextField tfSecurityA = new JTextField("write your security answer");

		lblUserName.setText("Choose user Name");
		lblPassword.setText("Choose your password");
		lblSecurityA.setText("Answer goes here");

		tfUserName.getText();
		tfPassword.getText();
		tfSecurityQ.getText();
		tfSecurityA.getText();
		


		// Create a text field with text "Type Name Here"
	
		final JTextField jtfNameFirst = new JTextField("Enter First Name");
		final JTextField jtfNameLast = new JTextField("Enter Last Name");
		final JTextField jtfAddress = new JTextField("Enter Address");
		final JTextField jtfCityName = new JTextField("Enter City Name");
		final JTextField jtfZIPcode = new JTextField("Enter ZIP Code");
		final JTextField jtfSSN = new JTextField("Enter SSN");

		// Create a button with text continue
		JButton jbtSubmit = new JButton("Continue");
		jbtSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				CustomerUserGUI.main(new String[0]);
				
				try {
		            String url = "jdbc:sqlserver://H3ATNATION\\SQLEXPRESS;databaseName=FlightSystem;integratedSecurity=true;";   
		            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		            Connection conn = DriverManager.getConnection(url);
					PreparedStatement pst;
					String sql = "INSERT INTO Customer1 (FirstName, LastName, Street, City, ZipCode, SSN) VALUES(?,?,?,?,?,?)";

		            pst = conn.prepareStatement(sql);

					//pst = cn.prepareStatement(sql);
		            String zipCode = jtfZIPcode.getText();
		            String ssn = jtfSSN.getText();
					pst.setString(1, jtfNameFirst.getText());
					pst.setString(2, jtfNameLast.getText());
					pst.setString(3, jtfAddress.getText());
					pst.setString(4, jtfCityName.getText());
					pst.setLong(5, Long.parseLong(zipCode));
					pst.setLong(6, Long.parseLong(ssn));

					int n = pst.executeUpdate();
					if (n > 0) {
						JOptionPane.showMessageDialog(null, "Saved");

					}
				} catch (SQLException | ClassNotFoundException e) {
					e.printStackTrace();
				}

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

		panel.add(jlblAddress);
		panel.add(jtfAddress);

		panel.add(jlblCityName);
		panel.add(jtfCityName);

		panel.add(jlblZIP);
		panel.add(jtfZIPcode);
		
		panel.add(jlblSSN);
		panel.add(jtfSSN);
		
		panel.add(lblUserName);
		panel.add(tfUserName);

		panel.add(lblPassword);
		panel.add(tfPassword);

		panel.add(lblSecurityQ);
		panel.add(tfSecurityQ);
		panel.add(lblSecurityA);
		panel.add(tfSecurityA);

		

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