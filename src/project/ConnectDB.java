package project;

import java.sql.*;

public class ConnectDB {
	
	private Connection conn= null;
	private Statement st;
	private ResultSet rs;
	
	public ConnectDB() {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newjava", "root", "password");
			st =conn.createStatement();
		}
		catch( Exception ex){
			System.out.println("error" + ex);
		}
	}
	
	
	//retrieves records from data base and prints them out
	public void getData(){
		try{
			
			String query = "select * from customer";
			rs = st.executeQuery(query);
			System.out.println("records from database");
			while(rs.next()){
				String customerID = rs.getString("CustomerID");
				String firstName = rs.getString("FirstName");
				System.out.println("ID: " + customerID + " " + "name: " +firstName + " " );
			}
			
		} catch(Exception ex){
			System.out.println(ex);

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public void PreparedStatement (String sql) {
		try{
		PreparedStatement pst = conn.prepareStatement("INSERT INTO Customers(FirstName, LastName, Address, City, State, Zip_Code) VALUES(?,?,?,?,?,?)");

		}
		catch(Exception ex){
			System.out.println(ex);

		}
		
	}


	public Connection connect() {
	
		return null;
	}


	public PreparedStatement preparedStatement(String sql) {
		try{
			PreparedStatement pst = conn.prepareStatement("INSERT INTO Customers(FirstName, LastName, Address, City, State, Zip_Code) VALUES(?,?,?,?,?,?)");

			}
			catch(Exception ex){
				System.out.println(ex);

			}
		return null;
	}

	
	

}
