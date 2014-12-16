package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DeleteFlightGUI extends JFrame {

	private static final long serialVersionUID = 1267588182839853118L;

	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();

	public DeleteFlightGUI() {

		//frame properties
		frame1.setTitle("Admin - Delete Flight Window");
		frame1.setSize(400,300);
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
		title.setText("Delete Flight");
		title.setFont(new Font("verdana", Font.PLAIN, 18));
		panel.add(title);
		panel1.setSize(new Dimension(50,50));

		//update menu

		JLabel updateTitle = new JLabel();
		updateTitle.setText("Delete flight ");
		panel1.add(updateTitle);
		updateTitle.setAlignmentX(TOP_ALIGNMENT);
		
		//show flight to be changed
			
		//labels to add new customer information
		JLabel flightID = new JLabel();
		flightID.setText("Flight ID");
		JTextField flightID1 = new JTextField();
		flightID1.getText();
		

		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(flightID);
		panel2.add(flightID1);
		

		// Create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");
		jbtCancel.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		}
				);
		
		// Create a button with text Done
				JButton done = new JButton("Done");
				done.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent e) {
						frame1.dispose();
					}
				}
						);
		
		//create the update button
		
		JButton jbtUpdate = new JButton("Delete");
		jbtUpdate.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//code or reference to the class where it contains the prepared sql statement
				//and the code to update the database records. 
								
			}
		});
	
		//panel 3 properties
		// this is where the update button and cancel button reside
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		panel3.add(jbtUpdate);
		panel3.add(done);
		panel3.add(jbtCancel);
		
	}

	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new DeleteFlightGUI();
			}
		});
	}
}

