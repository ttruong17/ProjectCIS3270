package gui;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UpdateFlightsGUI extends JFrame {

	private static final long serialVersionUID = 1267588182839853118L;

	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();

	public UpdateFlightsGUI() {

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
		title.setText("Update and Delete fligth Info");
		title.setFont(new Font("verdana", Font.PLAIN, 18));
		panel.add(title);
		panel1.setSize(new Dimension(50,50));

		//update menu

		JLabel updateTitle = new JLabel();
		updateTitle.setText("Update flight info");
		panel1.add(updateTitle);
		updateTitle.setAlignmentX(TOP_ALIGNMENT);
		//show customer to be changed info
			

		//labels to add new customer information

		JLabel updateDate = new JLabel();
		updateDate.setText("Departure Date");
		JTextField updateDate1 = new JTextField();
		updateDate1.setText(" New Departure Date ");

		JLabel updateTime = new JLabel (); 
		updateTime.setText("Departure Time");
		JTextField updateTime1 = new JTextField();
		updateTime1.setText("New Time");

		JLabel update = new JLabel();
		updateState.setText("State");
		JTextField updateState1 = new JTextField();
		updateState1.setText("New State");

		JLabel updateZipCode = new JLabel();
		updateZipCode.setText("ZIP Code");
		JTextField updateZipCode1 = new JTextField();
		updateZipCode1.setText("New ZIP Code");

		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(updateAddress);
		panel2.add(updateAddress1);

		panel2.add(updateCity);
		panel2.add(updateCity1);

		panel2.add(updateState);
		panel2.add(updateState1);

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
			//code or reference to the class where it contains the prepared sql statement
				//and the code to update the database records. 
				
			}
		});

		//panel 3 properties
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		panel3.add(jbtUpdate);
		panel3.add(jbtCancel);
		
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new UpdateFlightsGUI();
			}
		});
	}

}