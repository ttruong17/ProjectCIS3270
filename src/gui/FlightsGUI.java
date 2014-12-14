package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class FlightsGUI extends JFrame {

	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();

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
		mainPanel.add(panel4);

		// panel code - welcome message
		JLabel jlblWelcome = new JLabel();
		jlblWelcome.setText("Flight Search  ");
		jlblWelcome.setFont(new Font("Courier New", Font.ITALIC, 16));

		// Admin only features

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

		// panel 2
		// this panel displays the results from the database

		// old panel 2 code
		JLabel lblDate1 = new JLabel();
		lblDate1.setText("Departing Date:");
		// JLabel lblDate2 = new JLabel();
		// lblDate2.setText("Return Date");

		JTextField txtDate1 = new JTextField("Enter Date MM/DD/YYYY");
		txtDate1.getText();

		// JTextField txtDate2 = new JTextField("Enter Date MM/DD/YYYY");
		// txtDate1.getText();

		panel2.add(lblDate1);
		panel2.add(txtDate1);

		// panel2.add(lblDate2);
		// panel2.add(txtDate2);

		/* Panel 3 */
		// departure time
		JLabel departureTime = new JLabel("Departure Time");
		panel3.add(departureTime);

		// hour selection
		String[] hours = new String[] { "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "11", "12" };

		JComboBox<String> availableHours = new JComboBox<>(hours);

		// add to panel
		panel3.add(availableHours);

		// get the selected item:
		String selectedHour = (String) availableHours.getSelectedItem();

		// select minutes
		String[] mins = new String[] { "00", "30" };

		JComboBox<String> availableMins = new JComboBox<>(mins);
		// add to panel
		panel3.add(availableMins);
		// get selected item
		String selectedMins = (String) availableMins.getSelectedItem();

		// select am or pm
		String[] day = new String[] { "AM", "PM" };

		JComboBox<String> availableDay = new JComboBox<>(day);
		// add to panel
		panel3.add(availableDay);
		// get selected item
		String selectedDay = (String) availableDay.getSelectedItem();

		// Create a button with text Search
		JButton jbtSearch = new JButton("Search");
		jbtSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					/*
					// code must link to database to search for flights
				*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		// add the buttons to the panel
		panel3.add(jbtSearch);

		// panel4 will be exclusively left to the admin
		// should only visible if admin logs in

		JLabel adminMessage = new JLabel();
		adminMessage
				.setText("Admin Menu: Here you can update customer information.");
		JLabel adminMessage2 = new JLabel();
		adminMessage2.setText("You can also add, delete and modify Flights");
		panel4.add(adminMessage);
		panel4.add(adminMessage2);

	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FlightsGUI();
			}
		});
	}
}
