package gui;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMenuGUI {

	JFrame frame1 = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	public MainMenuGUI() {
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

		frame1.add(panel1);
		
		frame1.add(panel2);
		frame1.setTitle("Main Menu");
		frame1.setSize(400,400);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.setVisible(true);
		frame1.setLocation(500,100);

		JLabel jlblWelcome = new JLabel();
		jlblWelcome.setText("Welcome to Our Online airplane reservation system " );
		jlblWelcome.setFont(new Font("Courier New", Font.ITALIC, 16));
		
		JLabel jlblUserName = new JLabel();
		jlblUserName.setText("Username");
		
		JLabel jlblPassword = new JLabel();
		jlblPassword.setText("Password");
		
		JTextField jtfUserName = new JTextField(" Enter User Name");
		JTextField jtfPassword = new JTextField(" Enter Password");

 		
		//add the welcome Message
		panel1.add(jlblWelcome);
		
		
		panel2.add(jlblUserName);
		panel2.add(jtfUserName);
		panel2.add(jlblPassword);
		panel2.add(jtfPassword);
		
		// Create a button with text Enter
		JButton jbtSubmit = new JButton("Enter");
		jbtSubmit.addActionListener(null);

		// Create a button with text Exit
		//will exit the application
		JButton jbtCancel = new JButton("Exit");
		jbtCancel.addActionListener(null); 

		panel1.add(jbtSubmit); // Add the OK button to the panel
		panel1.add(jbtCancel); // Add the Cancel button to the panel
		
	}

	public static void main (String [] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainMenuGUI();
			}
		});
	}
}

