package project;

import java.util.Arrays;

import javax.swing.JPanel;

public class Credentials {

	String userName;
	String password;
	
	
	public Credentials() {
		
	}

	
	public static void main(String[] args) {
	
	
	}

	


private boolean checkIfCorrect(String [] input) {
	boolean isCorrect = false;
	String [] correctPass = {"java"};
	checkIfCorrect(input); {
	
	
	if(input.length != correctPass.length) {
		isCorrect = false;
	} else {
		isCorrect = Arrays.equals(input, correctPass);
	}
		Arrays.fill(correctPass, '0');
		return isCorrect;

	}};

	
	

	/**
	 * @return the UserName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param UserName
	 *            the firstName to set
	 */
	public void setUserName(String UserName) {
		this.userName = UserName;
	}

	/**
	 * @return the Password
	 */
	public String Password() {
		return password;
	}

	/**
	 * @param Password
	 *            the Password to set
	 */
	public void setPassword(String Password) {
		this.password = Password;
	}
}


