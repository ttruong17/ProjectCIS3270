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

		// frame properties
		frame1.setTitle("Admin - Update Window");
		frame1.setSize(700, 400);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.setVisible(true);
		frame1.setLocation(500, 100);

		// add panels to the main frame
		frame1.add(mainPanel);
		mainPanel.add(panel);
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		// title visible to the admin
		JLabel title = new JLabel();
		title.setText("Update customer Info");
		title.setFont(new Font("verdana", Font.PLAIN, 20));
		panel.add(title);

		// customer ID
		JLabel customerID = new JLabel();
		customerID.setText("CustomerID");
		final JTextField customerID1 = new JTextField();
				
		// customer address
		JLabel updateAddress = new JLabel();
		updateAddress.setText("Address");
		final JTextField updateAddress1 = new JTextField();

		JLabel updateCity = new JLabel();
		updateCity.setText("City");
		final JTextField updateCity1 = new JTextField();

		JLabel updateZipCode = new JLabel();
		updateZipCode.setText("ZIP Code");
		final JTextField updateZipCode1 = new JTextField();


		// create the update button
		//
		JButton update = new JButton("Update");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String url = "jdbc:sqlserver://H3ATNATION\\SQLEXPRESS;databaseName=FlightSystem;integratedSecurity=true;";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					Connection conn = DriverManager.getConnection(url);
					PreparedStatement pst;
					String sql = "Update Customer1 SET Street=?, City=?, ZipCode=? WHERE CustomerID=?";

					pst = conn.prepareStatement(sql);

					pst.setString(1, updateAddress1.getText());
					pst.setString(2, updateCity1.getText());
					pst.setString(3, updateZipCode1.getText());
					pst.setString(4, customerID1.getText());


					int n = pst.executeUpdate();
					if (n > 0) {
						JOptionPane.showMessageDialog(null,
								"Updated Successfully.");

					}
				} catch (SQLException | ClassNotFoundException ae) {
					ae.printStackTrace();
				}

			}
		});

		
		/* panel 2 properties */
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

		panel2.add(customerID);
		panel2.add(customerID1);

		panel2.add(updateAddress);
		panel2.add(updateAddress1);

		panel2.add(updateCity);
		panel2.add(updateCity1);

		panel2.add(updateZipCode);
		panel2.add(updateZipCode1);

		// Create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");
		jbtCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		});

		// create the done button
		JButton done = new JButton();
		done.setText("Done");
		done.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		});

		// panel 3 properties
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		panel3.add(update);
		panel3.add(jbtCancel);
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