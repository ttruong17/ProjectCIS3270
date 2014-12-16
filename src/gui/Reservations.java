package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

				JLabel userName = new JLabel();
				userName.setText("Enter your userName");
				JTextField nameInput = new JTextField();
				
				JLabel flight = new JLabel();
				flight.setText("Enter Flight ID");
				JTextField flightInfo = new JTextField();
				
				panel3.add(userName);
				panel3.add(nameInput);
				panel3.add(flight);
				panel3.add(flightInfo);
				
				//panel 4 
				
				JButton submit = new JButton();
				submit.setText("Submit");
				
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
