package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Reservations {

	
	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	
	public Reservations(){
		
		//frame properties
				frame1.setTitle("Reservation window");
				frame1.setSize(400, 300);
				frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame1.setVisible(true);
				frame1.setLocation(500, 100);

				//add panels to the main frame
				frame1.add(mainPanel);
				mainPanel.add(panel);
				mainPanel.add(panel1);
				mainPanel.add(panel2);
				mainPanel.add(panel3);
				mainPanel.add(panel4);
				mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

				//title 
				JLabel title = new JLabel();
				title.setText("Flight Reservation Menu");
				title.setFont(new Font("verdana", Font.PLAIN, 18));
				panel.add(title);
				panel.setSize(new Dimension(50,50));
				
				
				//panel 2 
				
				//flight results
				JLabel results = new JLabel();
				results.setText("Flight results");
				panel1.add(results);
				
				//panel 3 
				panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));

				final JLabel customerID = new JLabel();
				customerID.setText("Enter your CustomerID");
				final JTextField nameInput = new JTextField();
				nameInput.getText();
				
				JLabel flight = new JLabel();
				flight.setText("Enter Flight ID");
				final JTextField flightInfo = new JTextField();
				flightInfo.getText();
				
				panel3.add(customerID);
				panel3.add(nameInput);
				panel3.add(flight);
				panel3.add(flightInfo);
				
				//panel 4 
				
				JButton submit = new JButton();
				submit.setText("Submit");
				submit.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						try {
				            String url = "jdbc:sqlserver://H3ATNATION\\SQLEXPRESS;databaseName=FlightSystem;integratedSecurity=true;";   
				            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				            Connection conn = DriverManager.getConnection(url);
							PreparedStatement pst;
							String sql = "Insert Into Reservation (CustomerID, FlightID) VALUES(?,?)";

				            pst = conn.prepareStatement(sql);
				            int a = Integer.parseInt(nameInput.getText());
							pst.setString(1, nameInput.getText());
							pst.setString(2, flightInfo.getText());

							
							int n = pst.executeUpdate();
							if (n > 0) {
								JOptionPane.showMessageDialog(null, "Flight Reserved");

							}
						} catch (SQLException | ClassNotFoundException ae) {
							ae.printStackTrace();
						}

					}
				});
				JButton cancelButton = new JButton();
				cancelButton.setText("Cancel");
				cancelButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						frame1.dispose();
						
					}
					
				});
				
				panel4.add(submit);
				panel4.add(cancelButton);
				
				

	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Reservations();
			}
		});
	}

	}
