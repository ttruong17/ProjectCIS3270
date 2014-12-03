package project;

import gui.CustomerGUI;
import gui.MainMenuGUI;

import java.util.InputMismatchException;
import java.util.Scanner;
import project.Customers;

public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
Thread.currentThread().sleep(100);
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainMenuGUI();
			}
		});
	}
}
