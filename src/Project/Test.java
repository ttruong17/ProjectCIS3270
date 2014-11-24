package project;

import java.util.InputMismatchException;
import java.util.Scanner;
import project.Customers;

public class Test {

	public static void main(String[] args) {
		 customer();
 Customers customer1 = new Customers();		

	}
	
	public static void customer (){
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
	}
	}
