package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CustomerCancelReservation {

	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();

	
	
	CustomerCancelReservation(){
	
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
				mainPanel.add(panel4);
				mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

				// title visible to the customer
				JLabel title = new JLabel();
				title.setText("Customer Cancelation Window");
				title.setFont(new Font("verdana", Font.PLAIN, 20));
				panel.add(title);
				
				JLabel intro = new JLabel ();
				intro.setText("Flights booked");
				panel1.add(intro);

				JLabel lbluserName = new JLabel();
				lbluserName.setText(" Username for security purposes  ");
				final JTextField user = new JTextField("Enter your username");
				user.getText();
				panel1.add(lbluserName);
				panel1.add(user);
				
				/* database results */
				//will display in panel 2
				
				
				//panel3 information
				panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
				JLabel message = new JLabel();
				message.setText("Enter the flight you want to cancel");
				panel3.add(message);
				
				
				/* view reservations for the current customer */
				JButton reservations = new JButton();
				reservations.setText("View Reservations");
				reservations.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
					//displays reserved flights for that customer
						
						try{
							
							String url = "jdbc:sqlserver://H3ATNATION\\SQLEXPRESS;databaseName=FlightSystem;integratedSecurity=true";   
							Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
							Connection conn = DriverManager.getConnection(url);
							PreparedStatement pst;
							
							//search customer reservations
							//if(user.getText() != null){
								String sql = "Select Flight1.FLIGHTID,Flight1.Destination,FLIGHT1.DestinationDate,FLIGHT1.DestinationHour,FLIGHT1.DestinationMin,FLIGHT1.DestinationAMPM,FLight1.Origin,FLIGHT1.OriginDate,Flight1.OriginHour,FLIGHT1.OriginMin, FLIGHT1.OriginAMPM" 
											+" FROM CUSTOMER1 FULL OUTER JOIN Reservation ON Customer1.CustomerID = Reservation.CustomerID FULL OUTER JOIN Flight1 ON Reservation.FlightID = Flight1.FlightID Where Customer1.userName=?";
							//	String sql = "Select *" 
							//			+" FROM CUSTOMER1 JOIN Reservation ON Customer1.CustomerID = Reservation.CustomerID JOIN Flight1 ON Reservation.FlightID = Flight1.FLIGHTID Where Customer1.customerID=?";

								pst = conn.prepareStatement(sql);

								pst.setString(1, user.getText());
								ResultSet rs;
								rs = pst.executeQuery();

					            while(rs.next())
					            {
				            	System.out.println("");
				                System.out.print("CustomerID: "+rs.getString(1));
				                System.out.print("FirstName : "+rs.getString(2));
					            
								/*	if(rs.next()== false){
										JOptionPane.showMessageDialog(null, "No Flights.");
									}
									else {
										JOptionPane.showMessageDialog(null, rs.getString(1) + rs.getString(2)+ rs.getString(3)+ rs.getString(4)+ rs.getString(5) );
									}*/
								
								String reservationID = rs.getString(1);
								String userID = rs.getString(2);
								String userName = rs.getString(3);
							 final String p = "reservation" + reservationID + " UserID" + userID;
								
								final JLabel result = new JLabel();
								result.setText(p.toString());
								//result.toString();
								panel3.add(result);
					            }
								//if FALSE new user window popup else continue to Flight Screen
								if(rs.next()== false){
									JOptionPane.showMessageDialog(null, "No BOOKED Flights.");
								}
								
					            
							//}
							else {
								JOptionPane.showMessageDialog(null, "No Records !");
							}
					            
						}
						catch(SQLException e){
							e.printStackTrace();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				});
				
				panel3.add(reservations);
				
			//	panel3.getDefaultLocale(result);
				
				JLabel reservationID = new JLabel();
				reservationID.setText("Enter Reservation ID");
				JTextField reservation = new JTextField();
				
				panel3.add(reservationID);
				panel3.add(reservation);
				
				//panel 4
				
				//done button
				JButton done = new JButton();
				done.setText("Done");
				done.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						
						frame1.dispose();
					}
					
				});
				panel4.add(done);
				
				//cancel button
				JButton cancel = new JButton();
				cancel.setText("Exit");
				cancel.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent ev){
						frame1.dispose();
					}
				});
				panel4.add(cancel);
				
				
				
	}

	
	public static void main(String[] args) {
	
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CustomerCancelReservation();
			}
		});
	}

	}


