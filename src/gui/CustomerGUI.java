package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import project.Customers;

public class CustomerGUI extends JFrame {

	private static final long serialVersionUID = 100001L;
	JPanel panel = new JPanel();
	//JFrame mainFrame = new JFrame();
	JFrame frame = new JFrame(); // Create a frame

	public CustomerGUI() {

		//frame properties
		frame.setTitle("New Customer Window");
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		// changes the layout of frame
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		frame.add(panel); // Add the panel to the frame

		// Create a button with text continue
		JButton jbtSubmit = new JButton("Continue");
		jbtSubmit.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent ae){
				try{
					CustomerUserGUI.main(new String[0]);
				}
				catch (Exception e){
					e.printStackTrace();
				}
			}
		});

		// Create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");
		jbtCancel.addActionListener(null);

		// Create a label with text "Enter your name: "
		JLabel jlblNameFirst = new JLabel("First Name: ");
		JLabel jlblNameLast = new JLabel("Last Name: ");
		JLabel jlblNameMiddle = new JLabel("Middle Name: ");
		JLabel jlblSteetNum = new JLabel("Street number: ");
		JLabel jlblStreetName = new JLabel("Street Name: ");
		JLabel jlblCityName = new JLabel("City Name: ");
		JLabel jlblStateName = new JLabel("State: ");
		JLabel jlblZIP = new JLabel("ZIP Code: ");

		// Create a text field with text "Type Name Here"
		JTextField jtfNameFirst = new JTextField("Enter First Name");
		JTextField jtfNameLast = new JTextField("Enter Last Name");
		JTextField jtfNameMiddle = new JTextField("Enter Middle Initial");
		JTextField jtfStreetNum = new JTextField("Enter Street Number");
		JTextField jtfStreetName = new JTextField("Enter Street Name");
		JTextField jtfCityName = new JTextField("Enter City Name");
		JTextField jtfStateName = new JTextField("Enter State Name");
		JTextField jtfZIPcode = new JTextField("Enter ZIP Code");

		panel.add(jlblNameFirst);// Add the label to the panel
		panel.add(jtfNameFirst); // Add the text field to the panel

		panel.add(jlblNameLast);
		panel.add(jtfNameLast);

		panel.add(jlblNameMiddle);
		panel.add(jtfNameMiddle);

		panel.add(jlblSteetNum);
		panel.add(jtfStreetNum);

		panel.add(jlblStreetName);
		panel.add(jtfStreetName);

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