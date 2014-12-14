package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.*;
public class MainMenuGUI {

	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	

	public MainMenuGUI() {

		// frame properties
		frame1.setTitle("Main Menu");
		frame1.setSize(700, 400);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.setVisible(true);
		frame1.setLocation(500, 100);

		// adds the ability to have more than one panel in the main panel
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		// adds the panels to the main frame
		frame1.add(mainPanel);
		mainPanel.add(panel);
		mainPanel.add(panel1);
		mainPanel.add(panel2);

		// panel code - welcome message
		JLabel jlblWelcome = new JLabel();
		jlblWelcome.setText("Welcome to Our Online airplane reservation system ");
		jlblWelcome.setFont(new Font("Courier New", Font.ITALIC, 16));

		// add the welcome Message to panel
		panel.add(jlblWelcome);

		// code for panel 1
		JLabel jlblUserName = new JLabel();
		jlblUserName.setText("Username");

		JLabel jlblPassword = new JLabel();
		jlblPassword.setText("Password");

		final JTextField jtfUserName = new JTextField("Enter User Name");
		final JTextField jtfPassword = new JTextField("Enter Password");
		jtfUserName.getText();
		
		final String userName = jtfUserName.toString();
		final String password = jtfPassword.toString();
		
		panel1.add(jlblUserName);
		panel1.add(jtfUserName);
		panel1.add(jlblPassword);
		panel1.add(jtfPassword);
		
		
		
		//button to login to system
		// Create a button with text Enter
		JButton jbtSubmit = new JButton("Log-in");
		jbtSubmit.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent ae) {
				
				//linked to the old sign-up window
				//CustomerUserGUI.main(new String[0]);
				
				try {
		            String url = "jdbc:sqlserver://H3ATNATION\\SQLEXPRESS;databaseName=FlightSystem;integratedSecurity=true;";   
		            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		            Connection conn = DriverManager.getConnection(url);
					PreparedStatement pst;
					String sql = "Select UserName FROM CUSTOMER1 WHERE UserName=? AND Password=?";

		            pst = conn.prepareStatement(sql);
		            
					pst.setString(1, jtfUserName.getText());
					pst.setString(2, jtfPassword.getText());
					ResultSet rs;
					rs = pst.executeQuery();
					
					//if FALSE new user window popup else continue to Flight Screen
					if(rs.next()== false){
					JOptionPane.showMessageDialog(null, "No User Found. Check UserName and Password! If New User, Sign Up!");
					CustomerGUI obj = new CustomerGUI ();
					obj.setVisible(true);

					}
					
					else {
						FlightsGUI obj = new FlightsGUI ();
						obj.setVisible(true);
					}
					
					//int n = pst.executeUpdate();
					//if (n > 0) {
//
				//	}
				} catch (SQLException | ClassNotFoundException e) {
					e.printStackTrace();
				}

			}
		});
		
		// Create a button with text Exit
		// will exit the application
		JButton jbtCancel = new JButton("Exit");
		jbtCancel.addActionListener(new ActionListener() {
		      @Override
		      public void actionPerformed(ActionEvent evt) {
		           System.exit(0);
		      }
		});
		jbtCancel.setHorizontalTextPosition(SwingConstants.LEFT);   


		panel1.add(jbtSubmit); // Add the OK button to the panel
		panel1.add(jbtCancel); // Add the Cancel button to the panel

		// panel 2 - sign-up message
		JLabel lblSignUp = new JLabel();
		lblSignUp.setText("New User? Register Now");
		panel2.add(lblSignUp);

		// sign-up button
		JButton jbtSignUp = new JButton();
		jbtSignUp.setText("Sign up");
		jbtSignUp.addActionListener(new ActionListener(){
			
			public void actionPerformed (ActionEvent ae){
				try{
					CustomerGUI.main(new String[0]);
					//hides the current frame
					//buggy
					//frame1.hide();
					
				}
				catch (Exception e){
					e.printStackTrace();
				}
			}
		});

		// add signup button to the panel
		panel2.add(jbtSignUp);

		// Add the forgot password message
		JButton jbtForgotPassword = new JButton();
		jbtForgotPassword.setText("Forgot Password?");
		panel2.add(jbtForgotPassword);
		jbtForgotPassword.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent ae){
				try{
					RecoverPasswordGUI.main(new String[0]);
				}
				catch (Exception e){
					e.printStackTrace();
				}
			}
		});

		}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainMenuGUI();
			}
		});
	}
}
