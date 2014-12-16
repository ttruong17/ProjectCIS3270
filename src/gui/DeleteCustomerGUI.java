package gui;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class DeleteCustomerGUI extends JFrame {

	private static final long serialVersionUID = 1267588182839853118L;

	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();


	public DeleteCustomerGUI() {

		//frame properties
		frame1.setTitle("Admin - Update Window");
		frame1.setSize(700, 400);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.setVisible(true);
		frame1.setLocation(500, 100);

		//add panels to the main frame
		frame1.add(mainPanel);
		mainPanel.add(panel);
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		//title visible to the admin
		JLabel title = new JLabel();
		title.setText("Remove customer Window");
		title.setFont(new Font("verdana", Font.PLAIN, 18));
		panel.add(title);
		
		/*information about the customer to be deleted*/
		
		//customer ID 
		JLabel customerID = new JLabel();
		customerID.setText("CustomerID");
		
		JTextField customerID1 = new JTextField();
		

		JLabel userName = new JLabel();
		userName.setText("User Name");
		final JTextField userName1 = new JTextField();	
		
		//panel 2 properties
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(customerID);
		panel2.add(customerID1);
		
		panel2.add(userName);
		panel2.add(userName1);
		
		// Create a button with text Cancel
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		}
				);
				
		//done button
		JButton done = new JButton("Done");
		done.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame1.dispose();
				
			}
		});
		
		//delete customer 
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				/* code to delete customer from the customer table and all of its dependencies */
				
			}
		});
		

		//panel 3 properties
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		panel3.add(delete);
		panel3.add(cancel);
		panel3.add(done);
		
		
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new DeleteCustomerGUI();
			}
		});
	}

}