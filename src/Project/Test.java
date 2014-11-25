package project;

import gui.CustomerGUI;

import java.util.InputMismatchException;
import java.util.Scanner;
import project.Customers;

public class Test {

	public static void main(String[] args) {
		 
 Customers customer1 = new Customers();		

CustomerGUI customer10 = new CustomerGUI();

	}
	
	/**private static void customer1(Customers customer1) {
		String firstName;
		String lastName;
		char middleName;
		long streetNum;
		String streetName;
		String city;
		String state;
		long zipCode;
	}
	*/

	/**public static void customer (){
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("first name");
			String firstName = in.next();
			System.out.println("last name");
			String lastName = in.next();
			System.out.println("middle initial");
			String middleName = in.next();
			System.out.println("street num");
			long streetNum = in.nextLong();
			System.out.println("street name");
			String streetName = in.next();
			System.out.println("city");
			String city = in.next();
			System.out.println("state");
			String state = in.next();
			System.out.println("zip code");
			long zipCode = in.nextLong();
		} catch (NullPointerException ex) {
			ex.getMessage();
			System.out.println("An error Occured " + ex.getMessage());
		} catch (InputMismatchException ex) {
			ex.getMessage();
			System.out.println("An error Occured " + ex.getMessage());
		} catch (java.lang.Exception ex) {
			System.out.println("An error Occured " + ex.getMessage());
		}
		in.close();
		*/
	//}
	}
