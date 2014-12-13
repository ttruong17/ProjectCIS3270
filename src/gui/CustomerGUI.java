package gui;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import project.NewCustomerAction;
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
		final JLabel jlblNameFirst = new JLabel("First Name: ");
		final JLabel jlblNameLast = new JLabel("Last Name: ");
		final JLabel jlblAddress = new JLabel("Address: ");
		final JLabel jlblCityName = new JLabel("City Name: ");
		final JLabel jlblStateName = new JLabel("State: ");
		final JLabel jlblZIP = new JLabel("ZIP Code: ");

		// Create a text field with text "Type Name Here"
		final JTextField jtfNameFirst = new JTextField("Enter First Name");
		final JTextField jtfNameLast = new JTextField("Enter Last Name");
		final JTextField jtfAddress = new JTextField("Enter Address");
		final JTextField jtfCityName = new JTextField("Enter City Name");
		final JTextField jtfStateName = new JTextField("Enter State Name");
		final JTextField jtfZIPcode = new JTextField("Enter ZIP Code");

		// Create a button with text continue
		JButton jbtSubmit = new JButton("Continue");
		jbtSubmit.addActionListener(new NewCustomerAction(){
			
		});

		// Create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");
		jbtCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frame.dispose();	
			}
		});
		jbtCancel.setHorizontalTextPosition(SwingConstants.RIGHT);
		

		panel.add(jlblNameFirst);// Add the label to the panel
		panel.add(jtfNameFirst); // Add the text field to the panel

		panel.add(jlblNameLast);
		panel.add(jtfNameLast);

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

	protected static void action(int disposeOnClose, boolean b) {
		// TODO Auto-generated method stub
		
	}

	protected static void actionPerformed() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CustomerGUI();
			}
		});
	}

}