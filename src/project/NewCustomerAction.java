package project;

import gui.CustomerGUI;
import gui.CustomerUserGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import project.Customers;

public class NewCustomerAction implements ActionListener  {
	/*This creates an infinite loop, why? */
	//CustomerGUI customer = new CustomerGUI();
	
	private static final long serialVersionUID = 1L;
	
	public void actionPerformed(ActionEvent ae) {

		ConnectDB conn = new ConnectDB();
		
		
		// temporal variables
		String firstName = jtfNameFirst.getText();
		String lastName = jtfNameLast.getText();
		String address = jtfAddress.getText();
		String city = jtfCityName.getText();
		String state = jtfStateName.getText();
		String zipCode = jtfZIPcode.getText();
		String sql = "INSERT INTO Customers(FirstName, LastName, Address, City, State, Zip_Code) VALUES('','','','','','')";

		PreparedStatement pst;
		try {
			pst = conn.preparedStatement(sql);
			pst.setString(1, firstName);
			pst.setString(2, lastName);
			pst.setString(3, address);
			pst.setString(4, city);
			pst.setString(5, state);
			pst.setString(6, zipCode);
			int n = pst.executeUpdate();
			if (n > 0) {
				JOptionPane.showMessageDialog(null, "Saved");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		CustomerUserGUI.main(new String[0]);
	}
	
	public static void main(String[] args) {

	}

}
