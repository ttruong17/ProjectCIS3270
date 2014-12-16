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
		frame1.setTitle("Admin - Update Flight Window");
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
		title.setText("Update fligth Info");
		title.setFont(new Font("verdana", Font.PLAIN, 18));
		panel.add(title);
		panel1.setSize(new Dimension(50,50));

		//update menu

		JLabel updateTitle = new JLabel();
		updateTitle.setText("Update flight info");
		panel1.add(updateTitle);
		updateTitle.setAlignmentX(TOP_ALIGNMENT);
		
		//show flight to be changed
			
		//labels to add new customer information
		JLabel flightID = new JLabel();
		flightID.setText("Flight ID");
		JTextField flightID1 = new JTextField();
		flightID1.getText();
		
		JLabel updateDate = new JLabel();
		updateDate.setText("Departure Date");
		JTextField updateDate1 = new JTextField();
		updateDate1.getText();

		JLabel updateTime = new JLabel (); 
		updateTime.setText("Departure Time");
		JTextField updateTime1 = new JTextField();
		updateTime1.getText();

		JLabel updateDestinationDate = new JLabel();
		updateDestinationDate.setText("Destination Date");
		JTextField updateDestinationDate1 = new JTextField();
		updateDestinationDate1.getText();

		JLabel updateDestinationTime = new JLabel();
		updateDestinationTime.setText("Destination Time");
		JTextField updateDestinationTime1 = new JTextField();
		updateDestinationTime1.getText();

		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(flightID);
		panel2.add(flightID1);
		
		panel2.add(updateDate);
		panel2.add(updateDate1);

		panel2.add(updateTime);
		panel2.add(updateTime1);

		panel2.add(updateDestinationDate);
		panel2.add(updateDestinationDate1);

		panel2.add(updateDestinationTime);
		panel2.add(updateDestinationTime1);

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
		jbtUpdate.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//code or reference to the class where it contains the prepared sql statement
				//and the code to update the database records. 
								
			}
		});
	
		JButton done = new JButton();
		done.setText("Done");
		done.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		});
		
		//panel 3 properties
		// this is where the update button and cancel button reside
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		panel3.add(jbtUpdate);
		panel3.add(jbtCancel);
		panel3.add(done);
		
		
	}

	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new UpdateFlightsGUI();
			}
		});
	}
}

