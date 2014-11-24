package gui;

import javax.swing.*;

import project.Customers;

public class CustomerGUI extends JFrame {
	
	private static final long serialVersionUID = 100001L;

	private static  void CustomerGUI() {
		 // Create a text field with text "Type Name Here"
	    JTextField jtfNameFirst = new JTextField("First Name");
	    JTextField jtfNameLast = new JTextField("Last Name");
	    JTextField jtfNameMiddle = new JTextField("Middle Initial");
	    JTextField jtfStreetNum = new JTextField("Street Number");
	    JTextField jtfStreetName = new JTextField("Street Name");
	    JTextField jtfCityName = new JTextField("City Name");
	    JTextField jtfStateName = new JTextField("State Name");
	    JTextField jtfZIPcode = new JTextField("ZIP Code");


		JPanel panel = new JPanel();
		
		JFrame frame = new JFrame(); // Create a frame
	    frame.add(panel); // Add the panel to the frame
	    frame.setTitle("Show GUI Components");
	    frame.setSize(250, 400);
	    frame.setLocation(200, 100);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    
	    // Create a button with text OK 
    JButton jbtSubmit = new JButton("Submit"); 
    jbtSubmit.addActionListener(null);

    // Create a button with text Cancel 
    JButton jbtCancel = new JButton("Cancel"); 

    // Create a label with text "Enter your name: "
    JLabel jlblNameFirst = new JLabel("Enter your first name: "); 
    JLabel jlblNameLast = new JLabel("Enter your last name: ");
    JLabel jlblNameMiddle = new JLabel("Enter your middle name: ");
    JLabel jlblSteetNum = new JLabel("Enter your street num: ");
    JLabel jlblStreetName = new JLabel("Enter your street name: ");
    JLabel jlblCityName = new JLabel("Enter your city name: ");
    JLabel jlblStateName = new JLabel("Enter your State: ");
    JLabel jlblZIP = new JLabel("Enter your zip code: "); 
    

    
    
    panel.add(jlblNameFirst);// Add the label to the panel
    panel.add(jtfNameFirst); // Add the text field to the panel
    
    panel.add(jlblNameLast);
    panel.add(jtfNameLast);

    panel.add(jlblNameMiddle);
    panel.add(jtfNameMiddle);

    panel.add(jlblSteetNum);
    panel.add(jtfStreetNum);

    panel.add(jlblStreetName);
    panel.add(jtfStreetName);

    panel.add(jlblCityName);
    panel.add(jtfCityName);

    panel.add(jlblStateName);
    panel.add(jtfStateName);

    panel.add(jlblZIP);
    panel.add(jtfZIPcode);
    
    panel.add(jbtSubmit); // Add the OK button to the panel
    panel.add(jbtCancel); // Add the Cancel button to the panel
       
	}
	
public static void main (String [] args){
	
	javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			CustomerGUI();
		}
	});
}

}