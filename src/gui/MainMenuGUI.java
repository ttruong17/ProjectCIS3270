package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

		final JTextField jtfUserName = new JTextField(" Enter User Name");
		final JTextField jtfPassword = new JTextField(" Enter Password");

		panel1.add(jlblUserName);
		panel1.add(jtfUserName);
		panel1.add(jlblPassword);
		panel1.add(jtfPassword);
		
		
		
		//button to login to system
		// Create a button with text Enter
		JButton jbtSubmit = new JButton("Enter");
		jbtSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e){
						
		//insert code to check username and password credentials to Credentials.java
				 jtfUserName.getText();
				 String input = jtfPassword.toString();
				 
				 
				 
				 
			}
			
			private boolean checkIfCorrect(String [] input) {
				boolean isCorrect = false;
				String [] correctPass = {"java"};
				checkIfCorrect(input); {
				
				
				if(input.length != correctPass.length) {
					isCorrect = false;
				} else {
					isCorrect = Arrays.equals(input, correctPass);
				}
					Arrays.fill(correctPass, '0');
					return isCorrect;
			
				}}});

		
		
		
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
			@SuppressWarnings("deprecation")
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
