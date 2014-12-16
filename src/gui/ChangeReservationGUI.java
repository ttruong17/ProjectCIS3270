package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangeReservationGUI extends JFrame{
	
	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	public ChangeReservationGUI(){
		
				//frame properties
				frame1.setTitle("Admin - Change Reservation Window");
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

				//title for user
				JLabel title = new JLabel();
				title.setText("Change Customer Reservation");
				title.setFont(new Font("verdana", Font.PLAIN, 18));
				panel.add(title);
				
				//information field
				JLabel customerID = new JLabel();
				customerID.setText("CustomerID");
				final JTextField customerID1 = new JTextField();
				customerID1.getText();
				
				JLabel oldflightID = new JLabel();
				oldflightID.setText("Old Flight ID");
				final JTextField oldflightID1 = new JTextField();
				oldflightID1.getText();
			
				JLabel newFlightID = new JLabel();
				newFlightID.setText("New Flight ID");
				final JTextField newFlightID1 = new JTextField();
				newFlightID1.getText();
	
				JLabel updateTitle = new JLabel();
				updateTitle.setText("Update Customer Flight");
				
				JLabel disclaimer = new JLabel();
				final JTextField disclaimer1 = new JTextField();
				disclaimer.setText(" ");
			
				
				panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
				panel1.add(customerID);
				panel1.add(customerID1);
				panel1.add(oldflightID);
				panel1.add(oldflightID1);
				panel1.add(newFlightID);
				panel1.add(newFlightID1);				
				
				//add buttons "cancel" "submit" "update"
				
				JButton done = new JButton();
				done.setText("Done");
				done.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent arg0) {
					frame1.dispose();
						
					}
				}
		);
				
				JButton cancel = new JButton();
				cancel.setText("Cancel");
			    cancel.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent arg0) {
					frame1.dispose();
						
					}
				}
		);
				
				JButton update = new JButton();
				update.setText("Update");
				
				panel2.add(update);
				panel2.add(cancel);
				panel2.add(done);
				
				
	}

	public static void main(String[] strings) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ChangeReservationGUI();
			}
		});
	}		

}
