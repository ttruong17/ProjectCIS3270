package gui;

import javax.swing.*;

public class RecoverPasswordGUI extends JFrame {

		JFrame frame = new JFrame("Recover Password");
		JPanel panel1 = new JPanel();
		

		public RecoverPasswordGUI(){
			
			frame.setSize(400, 600);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setLocation(500, 60);
			frame.setVisible(true);
			
			JTextField jtfSecurityQ = new JTextField("Your security Q goes here");
		    JLabel jlblSecurityQ = new JLabel("Enter your street num: ");
			panel1.add(jtfSecurityQ);
			panel1.add(jlblSecurityQ);
			
			// Create a button with text Submit 
		    JButton jbtSubmit = new JButton("Submit"); 
		    jbtSubmit.addActionListener(null);

		    // Create a button with text Cancel 
		    JButton jbtCancel = new JButton("Cancel"); 
		    jbtCancel.addActionListener(null);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new RecoverPasswordGUI();
			}
		});
	}
}