package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
 
/*
 * Here we will learn to connect to Oracle DB using JDBC Driver.
 */
public class Test101 {
 
 public static void main(String[] args) {
 
 Scanner scanner = new Scanner(System.in);
 System.out
 .println("Please provide below details to connect MySQL Database");
 System.out.println("Enter Database");
 String dbName = scanner.next();
 System.out.println("Enter UserName");
 String userName = scanner.next();
 System.out.println("Enter Password");
 String password = scanner.next();
 
 //check for driver
 try {
 
 Class.forName("com.mysql.jdbc.Driver");
 
 } catch (ClassNotFoundException e) {
 e.printStackTrace();
 }
 
 Connection connection = null;
 //initiate connection
 try {
 connection = DriverManager
 .getConnection("jdbc:mysql://localhost:3306/" + dbName,
 userName, password);
 
 } catch (SQLException e) {
 e.printStackTrace();
 }
 //test connection
 if (connection != null) {
 System.out.println("Successfullly connected to MySQL DB");
 } else {
 System.out.println("Failed to connect to MySQL DB");
 }
 
 }
 
}
