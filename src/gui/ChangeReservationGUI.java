package gui;

import java.awt.Font;

import javax.swing.BoxLayout;
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

				//title visible to the admin
				JLabel title = new JLabel();
				title.setText("Change Customer Reservation");
				title.setFont(new Font("verdana", Font.PLAIN, 18));
				panel.add(title);
				
				JLabel customerID = new JLabel();
				customerID.setText("CustomerID");
				final JTextField customerID1 = new JTextField();
				//updateFirstName1.setText(" New Address ");
				
				JLabel updateLastName = new JLabel();
				updateLastName.setText("LastName");
				final JTextField updateLastName1 = new JTextField();
				//updateFirstName1.setText(" New Address ");

				JLabel updateAddress = new JLabel();
				updateAddress.setText("Address");
				final JTextField updateAddress1 = new JTextField();
				//updateAddress1.setText(" New Address ");

				JLabel updateCity = new JLabel (); 
				updateCity.setText("City");
				final JTextField updateCity1 = new JTextField();
				//updateCity1.setText("New City");

				JLabel updateZipCode = new JLabel();
				updateZipCode.setText("ZIP Code");
				final JTextField updateZipCode1 = new JTextField();
				//updateZipCode1.setText("New ZIP Code");

				//update menu
				// disclaimer
				
				JLabel updateTitle = new JLabel();
				updateTitle.setText("Update customer info");
				
				JLabel disclaimer = new JLabel();
				final JTextField disclaimer1 = new JTextField();
				disclaimer.setText(" ");
				
				//add disclaimer textfield
				
				panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
				panel1.add(updateTitle);
				panel1.add(disclaimer);
	}

	public static void main(String[] strings) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ChangeReservationGUI();
			}
		});
	}		

}
