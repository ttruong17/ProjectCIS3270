package gui;

import java.awt.*;
import javax.swing.*;

public class RecoverPasswordGUI extends JFrame {
	private static final long serialVersionUID = 1L;
		JFrame frame = new JFrame();
		JPanel mainPanel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); 
		JPanel panel3 = new JPanel();
	
		public RecoverPasswordGUI(){
			//frame properties
			frame.add(mainPanel);
			frame.setTitle("Recover Password Window");
			frame.setSize(400, 300);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setLocation(500, 60);
			frame.setVisible(true);
			
			// adds the ability to have more than one panel in the main panel
			mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
			
			mainPanel.add(panel1);
			mainPanel.add(panel2);
			mainPanel.add(panel3);
			
			//panel one code
			JLabel jlblWelcome = new JLabel("Recover Password");
			jlblWelcome.setFont(new Font("Courier New", Font.ITALIC, 16));
			panel1.add(jlblWelcome);
			
			//panel two code
			JLabel jlblSecurityQ = new JLabel("Your security question ");
			JTextField jtfSecurityQ = new JTextField("Your security ans goes here");
		    
			panel2.add(jlblSecurityQ);
			panel2.add(jtfSecurityQ);
			
			// Create a button with text Submit 
		    JButton jbtSubmit = new JButton("Submit"); 
		    jbtSubmit.addActionListener(null);

		    // Create a button with text Cancel 
		    JButton jbtCancel = new JButton("Cancel"); 
		    jbtCancel.addActionListener(null);
		    
		    panel3.add(jbtSubmit); // Add the OK button to the panel
		    panel3.add(jbtCancel); // Add the Cancel button to the panel
	}
		
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new RecoverPasswordGUI();
			}
		});
	}
}