package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Logger;

import javax.swing.*;

import project.ConnectDB;

/*import javax.swing.*;
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

}*/


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
	//	JLabel jlblCustomerID = new JLabel("First Name: ");
		JLabel jlblNameFirst = new JLabel("First Name: ");
		JLabel jlblNameLast = new JLabel("Last Name: ");
		JLabel jlblAddress = new JLabel("Address: ");
		JLabel jlblCityName = new JLabel("City Name: ");
		//JLabel jlblStateName = new JLabel("State: ");
		JLabel jlblZIP = new JLabel("ZIP Code: ");
		JLabel jlblSSN = new JLabel("SSN: ");


		// Create a text field with text "Type Name Here"
	//	final JTextField jtfCustomerID = new JTextField("Enter CustomerID");
		final JTextField jtfNameFirst = new JTextField("Enter First Name");
		final JTextField jtfNameLast = new JTextField("Enter Last Name");
		final JTextField jtfAddress = new JTextField("Enter Address");
		final JTextField jtfCityName = new JTextField("Enter City Name");
	//	final JTextField jtfStateName = new JTextField("Enter State Name");
		final JTextField jtfZIPcode = new JTextField("Enter ZIP Code");
		final JTextField jtfSSN = new JTextField("Enter SSN");

		// Create a button with text continue
		JButton jbtSubmit = new JButton("Continue");
		jbtSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

/*				ConnectDB conn = new ConnectDB();
				Connection cn = conn.connect();
				CustomerUserGUI.main(new String[0]);
				// temporal variables
				String firstName = jtfNameFirst.getText();
				String lastName = jtfNameLast.getText();
				String address = jtfAddress.getText();
				String city = jtfCityName.getText();
				String state = jtfStateName.getText();
				String zipCode = jtfZIPcode.getText();
				String ssn = jtfSSN.getText();
				String sql = "INSERT INTO Customers(FirstName, LastName, Address, City, State, Zip_Code) VALUES(?,?,?,?,?,?)";
				PreparedStatement pst;
				try {
					pst = cn.prepareStatement(sql);
					pst.setString(1, firstName);
					pst.setString(2, lastName);
					pst.setString(3, address);
					pst.setString(4, city);
					pst.setString(5, state);
					pst.setString(6, zipCode);
					int n = pst.executeUpdate();
					if (n > 0) {
						JOptionPane.showMessageDialog(null, "Saved");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}*/
				CustomerUserGUI.main(new String[0]);
				// temporal variables
				/*String firstName = jtfNameFirst.getText();
				String lastName = jtfNameLast.getText();
				String address = jtfAddress.getText();
				String city = jtfCityName.getText();
				String state = jtfStateName.getText();
				String zipCode = jtfZIPcode.getText();
				String ssn = jtfSSN.getText();*/


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
			//		pst.setString(0, jtfCustomerID.getText());
					pst.setString(1, jtfNameFirst.getText());
					pst.setString(2, jtfNameLast.getText());
					pst.setString(3, jtfAddress.getText());
					pst.setString(4, jtfCityName.getText());
				//	pst.setString(5, jtfStateName.getText());
					pst.setLong(5, Long.parseLong(zipCode));
					pst.setLong(6, Long.parseLong(ssn));
					
					//pst.executeUpdate();

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
		
//		panel.add(jlblCustomerID);// Add the label to the panel
//		panel.add(jtfCustomerID); // Add the text field to the panel


		panel.add(jlblNameFirst);// Add the label to the panel
		panel.add(jtfNameFirst); // Add the text field to the panel

		panel.add(jlblNameLast);
		panel.add(jtfNameLast);

		panel.add(jlblAddress);
		panel.add(jtfAddress);

		panel.add(jlblCityName);
		panel.add(jtfCityName);

	//	panel.add(jlblStateName);
	//	panel.add(jtfStateName);

		panel.add(jlblZIP);
		panel.add(jtfZIPcode);
		
		panel.add(jlblSSN);
		panel.add(jtfSSN);


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