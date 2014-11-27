package gui;

import javax.swing.*;

public class CustomerUserGUI extends JFrame {

	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	// constructor
	public CustomerUserGUI() {

		// frame properties

		mainFrame.setTitle("New Customer window 2");
		mainFrame.setSize(400, 400);
		mainFrame.setLocation(200, 100);
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainFrame.setVisible(true);

		mainFrame.add(mainPanel);
		mainPanel.add(panel1);
		mainPanel.add(panel2);

		// Create a button with text Submit
		JButton jbtSubmit = new JButton("Submit");
		jbtSubmit.addActionListener(null);

		// Create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");
		jbtCancel.addActionListener(null);

		// add the buttons to the panel
		panel2.add(jbtSubmit);
		panel2.add(jbtCancel);
	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CustomerUserGUI();
			}
		});
	}
}
