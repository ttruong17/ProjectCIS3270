package gui;

import javax.swing.*;

public class RecoverPasswordGUI extends JFrame {

		JFrame frame = new JFrame();
		JPanel panel1 = new JPanel();
		

		public RecoverPasswordGUI(){
			
			frame.add(panel1);
			frame.setTitle("Recover Password");
			frame.setSize(400, 600);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setLocation(500, 60);
			frame.setVisible(true);
			
			JLabel jlblSecurityQ = new JLabel("Your security question ");
			JTextField jtfSecurityQ = new JTextField("Your security ans goes here");
		    
			panel1.add(jlblSecurityQ);
			panel1.add(jtfSecurityQ);
			
			// Create a button with text Submit 
		    JButton jbtSubmit = new JButton("Submit"); 
		    jbtSubmit.addActionListener(null);

		    // Create a button with text Cancel 
		    JButton jbtCancel = new JButton("Cancel"); 
		    jbtCancel.addActionListener(null);
		    
		    panel1.add(jbtSubmit); // Add the OK button to the panel
		    panel1.add(jbtCancel); // Add the Cancel button to the panel
	}
		
		

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new RecoverPasswordGUI();
			}
		});
	}
}