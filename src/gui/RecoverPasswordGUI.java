package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class RecoverPasswordGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	JFrame frame = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();

	public RecoverPasswordGUI() {
		// frame properties
		frame.add(mainPanel);
		frame.setTitle("Recover Password Window");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocation(500, 100);
		frame.setVisible(true);

		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);

		// panel one code
		JLabel jlblWelcome = new JLabel("Recover Password");
		jlblWelcome.setFont(new Font("Courier New", Font.ITALIC, 16));
		panel1.add(jlblWelcome);

		// panel two code
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		JLabel jlblUserName = new JLabel("UserName: ");
		final JTextField jtfUserName = new JTextField("");

		JLabel jlblSecurityQ = new JLabel("What is your favorite color?");
		final JTextField jtfSecurityA = new JTextField("");

		panel2.add(jlblUserName);
		panel2.add(jtfUserName);

		panel2.add(jlblSecurityQ);
		panel2.add(jtfSecurityA);
		
		// Create a button with text Submit
		JButton jbtSubmit = new JButton("Submit");
		jbtSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				
				//linked to the old sign-up window
				//CustomerUserGUI.main(new String[0]);
				
				try {
		            String url = "jdbc:sqlserver://H3ATNATION\\SQLEXPRESS;databaseName=FlightSystem;integratedSecurity=true;";   
		            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		            Connection conn = DriverManager.getConnection(url);
					PreparedStatement pst;
					String sql = "Select Password FROM CUSTOMER1 WHERE UserName=? AND SecurityA=?";

		            pst = conn.prepareStatement(sql);
		            
					pst.setString(1, jtfUserName.getText());
					pst.setString(2, jtfSecurityA.getText());
					ResultSet rs;
					rs = pst.executeQuery();
					
					//if FALSE new user window popup else continue to Flight Screen
					if(rs.next()== false){
					JOptionPane.showMessageDialog(null, "Security Answer is incorrect. Please contact System Admin.");

					}
					
					else {
						JOptionPane.showMessageDialog(null,"Password: " +rs.getString("Password"));
						MainMenuGUI obj = new MainMenuGUI ();
						//obj.setVisible(true);
						
						frame.dispose();
					}
					
				} catch (SQLException | ClassNotFoundException e) {
					e.printStackTrace();
				}

			}
		});
		// Create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");
		jbtCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				frame.dispose();
			}
		});
		
		//create the done button
		JButton done = new JButton();
		done.setText("Done");
		done.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		panel3.add(jbtSubmit); // Add the OK button to the panel
		panel3.add(jbtCancel); // Add the Cancel button to the panel
		panel3.add(done);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new RecoverPasswordGUI();
			}
		});
	}
}