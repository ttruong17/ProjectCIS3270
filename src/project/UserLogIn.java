package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import gui.MainMenuGUI;

public class UserLogIn implements ActionListener {
	public void actionPerformed(ActionEvent ae) {

		ConnectDB conn = new ConnectDB();
		
		// temporal variables
		String userNameMainMenu = jtfUserName.getText();
		String passwordMainMenu = jtfPassword.getText();
		String userNameDB;
		String passwordDB ;
		
		String sql = "INSERT INTO Customers(FirstName, LastName, Address, City, State, Zip_Code) VALUES(?,?,?,?,?,?)";

		PreparedStatement pst;
		try {
			pst = conn.PreparedStatement(sql);
			pst.setString(1, userNameMainMenu);
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

	}
	
	ConnectDB connection = new ConnectDB();
	MainMenuGUI menu = new MainMenuGUI(); 
	
	
	/* created to test connectivity to the database via scanner
	public void checkCredentials() {
	//Get username from MainMenuGUI
	String userNameMainMenu = menu.;
	//Get password from MainMenuGUI
	String passwordMainMenu = "adminsrock";
	//Get Username from Database
	String usernameDB = "admin";
	//Get Password from Database
	String passwordDB = "adminsrock";
	
	//method to compare username and password
	if(userNameMainMenu.matches(usernameDB)&& passwordMainMenu.matches(passwordDB)){
		System.out.println("success");
	}
	else{
		System.out.println("credentials do not match");
	}
	//return the 
	}
	*/
	
	
	public UserLogIn() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
