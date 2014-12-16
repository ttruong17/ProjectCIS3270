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

public class UpdateCustomerGUI extends JFrame {

	private static final long serialVersionUID = 1267588182839853118L;

	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();


	public UpdateCustomerGUI() {

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
		title.setText("Update customer Info");
		title.setFont(new Font("verdana", Font.PLAIN, 18));
		panel.add(title);
		
		JLabel updateFirstName = new JLabel();
		updateFirstName.setText("FirstName");
		final JTextField updateFirstName1 = new JTextField();
		//updateFirstName1.setText(" New Address ");
		
		JLabel updateLastName = new JLabel();
		updateLastName.setText("LastName");
		final JTextField updateLastName1 = new JTextField();
		//updateFirstName1.setText(" New Address ");

		JLabel updateAddress = new JLabel();
		updateAddress.setText("Address");
		final JTextField updateAddress1 = new JTextField();
		//updateAddress1.setText(" New Address ");

		JLabel updateCity = new JLabel (); 
		updateCity.setText("City");
		final JTextField updateCity1 = new JTextField();
		//updateCity1.setText("New City");

		JLabel updateZipCode = new JLabel();
		updateZipCode.setText("ZIP Code");
		final JTextField updateZipCode1 = new JTextField();
		//updateZipCode1.setText("New ZIP Code");

		//update menu
		// disclaimer
		
		JLabel updateTitle = new JLabel();
		updateTitle.setText("Update customer info");
		
		JLabel disclaimer = new JLabel();
		final JTextField disclaimer1 = new JTextField();
		disclaimer.setText(" ");
		
		//add disclaimer textfield
		
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.add(updateTitle);
		panel1.add(disclaimer);
		
		//show customer to be changed info
		
		//this actionevent will search for customer where customerID = disclaimer
		//need this to show existing customer info in fields
		JButton jbtEnterDisclaimer = new JButton("OK");
		jbtEnterDisclaimer.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent ae) {
			
			//linked to the old sign-up window
			//CustomerUserGUI.main(new String[0]);
			
			try {
	            String url = "jdbc:sqlserver://H3ATNATION\\SQLEXPRESS;databaseName=FlightSystem;integratedSecurity=true;";   
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            Connection conn = DriverManager.getConnection(url);
				PreparedStatement pst;
				String sql = "Select FirstName, LastName, Street, City, ZipCode FROM CUSTOMER1 WHERE CustomerID=?";

	            pst = conn.prepareStatement(sql);
	            
				pst.setString(1, disclaimer1.getText());
				ResultSet rs;
				rs = pst.executeQuery();
				
				//loops through rows where CustomerID=disclaimer1
				if(rs.next()){
					updateFirstName1.setText(rs.getString("FirstName"));
					updateLastName1.setText(rs.getString("LastName"));
					updateAddress1.setText(rs.getString("Street"));
					updateCity1.setText(rs.getString("City"));
					updateZipCode1.setText(rs.getString("ZipCode"));

				}
				else{
					updateFirstName1.setText(null);
					updateLastName1.setText(null);
					updateAddress1.setText(null);
					updateCity1.setText(null);
					updateZipCode1.setText(null);
					
					JOptionPane.showMessageDialog(null,"No Customer Found.");
				}
				
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}

		}
	});


	/*	//labels to add new customer information

		JLabel updateAddress = new JLabel();
		updateAddress.setText("Address");
		JTextField updateAddress1 = new JTextField();
		updateAddress1.setText(" New Address ");

		JLabel updateCity = new JLabel (); 
		updateCity.setText("City");
		JTextField updateCity1 = new JTextField();
		updateCity1.setText("New City");

		JLabel updateState = new JLabel();
		updateState.setText("State");
		JTextField updateState1 = new JTextField();
		updateState1.setText("New State");

		JLabel updateZipCode = new JLabel();
		updateZipCode.setText("ZIP Code");
		JTextField updateZipCode1 = new JTextField();
		updateZipCode1.setText("New ZIP Code");*/

		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(updateAddress);
		panel2.add(updateAddress1);

		panel2.add(updateCity);
		panel2.add(updateCity1);

		panel2.add(updateZipCode);
		panel2.add(updateZipCode1);

		// Create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");
		jbtCancel.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		}
				);
		
		//create the update button
		
		JButton jbtUpdate = new JButton("Update");
		jbtUpdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					
					try {
			            String url = "jdbc:sqlserver://H3ATNATION\\SQLEXPRESS;databaseName=FlightSystem;integratedSecurity=true;";   
			            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			            Connection conn = DriverManager.getConnection(url);
						PreparedStatement pst;
						String sql = "Update Customer1 SET FirstName=?, LastName=?, Street=?, City=?, ZipCode=? WHERE CustomerID=?";

			            pst = conn.prepareStatement(sql);

						pst.setString(1, updateFirstName1.getText());
						pst.setString(2, updateLastName1.getText());
						pst.setString(3, updateAddress1.getText());
						pst.setString(4, updateCity1.getText());
						pst.setString(5, updateZipCode1.getText());
						pst.setString(6, disclaimer1.getText());

						
						int n = pst.executeUpdate();
						if (n > 0) {
							JOptionPane.showMessageDialog(null, "Updated Successfully.");

						}
					} catch (SQLException | ClassNotFoundException ae) {
						ae.printStackTrace();
					}

				}
			});
				
		
		//delete customer 
		JButton jbtDelete = new JButton("Delete");
		jbtUpdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				try {
		            String url = "jdbc:sqlserver://H3ATNATION\\SQLEXPRESS;databaseName=FlightSystem;integratedSecurity=true;";   
		            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		            Connection conn = DriverManager.getConnection(url);
					PreparedStatement pst;
					String sql = "Delete From Customer1 WHERE CustomerID=?";

		            pst = conn.prepareStatement(sql);

					pst.setString(1, disclaimer1.getText());
					
					int n = pst.executeUpdate();
					if (n > 0) {
						JOptionPane.showMessageDialog(null, "Deleted Record.");

					}
					else
						JOptionPane.showMessageDialog(null, "Already Deleted or Record Does Not Exist.");
					
				} catch (SQLException | ClassNotFoundException ae) {
					ae.printStackTrace();
				}

			}
		});
		
		//create the done button
		JButton done = new JButton();
		done.setText("Done");
		done.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		});
		
		
		//panel 3 properties
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		panel3.add(jbtUpdate);
		panel3.add(jbtCancel);
		//panel3.add(jbtDelete);
		panel3.add(done);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new UpdateCustomerGUI();
			}
		});
	}

}