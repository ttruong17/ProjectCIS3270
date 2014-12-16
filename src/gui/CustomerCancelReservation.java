package gui;

import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CustomerCancelReservation {

	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
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
				mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

				// title visible to the admin
				JLabel title = new JLabel();
				title.setText("Update customer Info");
				title.setFont(new Font("verdana", Font.PLAIN, 20));
				panel.add(title);
	}
	
	public static void main(String[] args) {
	
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CustomerCancelReservation();
			}
		});
	}

	}


