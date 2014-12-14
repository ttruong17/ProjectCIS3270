package project;

import gui.CustomerGUI;
import gui.CustomerUserGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import project.Customers;

public class NewCustomerAction extends CustomerGUI implements ActionListener  {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	/*
	//CustomerGUI customer = new CustomerGUI();
	
	private static final long serialVersionUID = 1L;
	
	public void actionPerformed(ActionEvent ae) {

		CustomerUserGUI.main(new String[0]);
		
		try {
            String url = "jdbc:sqlserver://H3ATNATION\\SQLEXPRESS;databaseName=FlightSystem;integratedSecurity=true;";   
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url);
			PreparedStatement pst;
			String sql = "INSERT INTO Customer1 (FirstName, LastName, Street, City, ZipCode, SSN) VALUES(?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);

			//pst = cn.prepareStatement(sql);
            String zipCode = jtfZIPcode.getText();
            String ssn = jtfSSN.getText();
			pst.setString(1, jtfNameFirst.getText());
			pst.setString(2, jtfNameLast.getText());
			pst.setString(3, jtfAddress.getText());
			pst.setString(4, jtfCityName.getText());
			pst.setLong(5, Long.parseLong(zipCode));
			pst.setLong(6, Long.parseLong(ssn));

			int n = pst.executeUpdate();
			if (n > 0) {
				JOptionPane.showMessageDialog(null, "Saved");

			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
});

// Create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");
		jbtCancel.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
			frame.dispose();
				
			}
		}
);
	}
	
	public static void main(String[] args) {

	}
*/
}
