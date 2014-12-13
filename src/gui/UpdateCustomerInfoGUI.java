package gui;
import javax.swing.*;

public class UpdateCustomerInfoGUI extends JFrame {

	JFrame frame1 = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	public UpdateCustomerInfoGUI{
		
		//frame properties
		frame1.setTitle("Admin - Update Window");
		frame1.setSize(700, 400);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.setVisible(true);
		frame1.setLocation(500, 100);
	}
}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new UpdateCustomerInfoGUI();
			}
		});
	}

	
