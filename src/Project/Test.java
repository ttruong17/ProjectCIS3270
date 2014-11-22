package project;

import java.util.Scanner;

public class Test {

	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("first name");
		String firstName = in.next();
		System.out.println("last name");
		String lastName= in.next();
		System.out.println("middle name");
		String middleName = in.next(); 
		System.out.println("street num");
		long streetNum = in.nextLong(); 
		System.out.println("street name");
		String streetName = in.next();
		System.out.println(" city");
		String city = in.next();
		System.out.println("state");
		String state = in.next();
		System.out.println("zip code");
		long zipCode= in.nextLong();
		
	}
}
