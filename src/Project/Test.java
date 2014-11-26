package project;

import gui.CustomerGUI;
import gui.MainMenuGUI;

import java.util.InputMismatchException;
import java.util.Scanner;
import project.Customers;

public class Test {

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainMenuGUI();
			}
		});
	}
	// MainMenuGUI mainMenu = new MainMenuGUI();

	// Customers customer1 = new Customers();

	// CustomerGUI customer10 = new CustomerGUI();

}

