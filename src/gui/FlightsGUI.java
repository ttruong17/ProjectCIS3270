package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class FlightsGUI {

	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();

	public FlightsGUI() {

		// frame properties
		frame1.setTitle("Flight Search Menu");
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
		mainPanel.add(panel3);

		// panel code - welcome message
		JLabel jlblWelcome = new JLabel();
		jlblWelcome.setText("Flight Search  ");
		jlblWelcome.setFont(new Font("Courier New", Font.ITALIC, 16));

		//Admin only features
		
	
		// add the welcome Message to panel
		panel.add(jlblWelcome);

		// code for panel 1
		JLabel jlblOrigin = new JLabel();
		jlblOrigin.setText("Origin");

		JLabel jlblDestination = new JLabel();
		jlblDestination.setText("Destination");

		JTextField jtfOrigin = new JTextField(" Flying From: ");
		JTextField jtfDestination = new JTextField(" Flying To: ");

		panel1.add(jlblOrigin);
		panel1.add(jtfOrigin);
		panel1.add(jlblDestination);
		panel1.add(jtfDestination);
		
		// Create a button with text Search
				JButton jbtSearch = new JButton("Search");
				jbtSearch.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						try {
							// code must link to database to search for flights
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});

				// add the buttons to the panel
				panel1.add(jbtSearch);

				
		//panel 2 
				//this panel displays the results from the database

		//old panel 2 code
	/*	JLabel lblDate1 = new JLabel();
		lblDate1.setText("Departing Date:");
		JLabel lblDate2 = new JLabel();
		lblDate2.setText("Return Date");

		JTextField txtDate1 = new JTextField("Enter Date MM/DD/YYYY");
		txtDate1.getText();

		JTextField txtDate2 = new JTextField("Enter Date MM/DD/YYYY");
		txtDate1.getText();

		panel2.add(lblDate1);
		panel2.add(txtDate1);

		panel2.add(lblDate2);
		panel2.add(txtDate2);
	 */
	
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FlightsGUI();
			}
		});
	}
}
