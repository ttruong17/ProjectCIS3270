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
	//all connection credentials set here
    //change the USERNAME and PASSWORD here to allow it to connect to any local database
    private final String USERNAME = "precision";
    private final String PASSWORD = "rocks";
    private final String connectionStr =
            "jdbc:hsqldb:file:data/phms;shutdown=true";
 
	
	//retrieves records from data base and prints them out
	public void getData(){
		try{
			
			String query = "select * from customer";
			rs = st.executeQuery(query);
			System.out.println("records from database");
			while(rs.next()){
				String customerID = rs.getString("CustomerID");
				String firstName = rs.getString("FirstName");
				System.out.println("name: " + customerID + " " + "age: " +firstName + " " );
			}
			
		} catch(Exception ex){
			System.out.println(ex);

		}
	}
	
	private boolean openConnection()
    {
        try {
            System.out.println("about to open the connection");
            conn = DriverManager.getConnection(connectionStr, USERNAME, PASSWORD);
            return true;
        }
        catch (SQLException e) {
            System.out.println("Unable to connect\nCause: "+e.getCause());
            System.out.println(e);
            return false;
        } 
    }
	
	public Connection getConnection()
    {
        if (conn == null) {
            if (openConnection()) {
                System.out.println("Connection opened");
                return conn;
            } else {
                return null;
            }
        }
        return conn;
    }
 
    //close the connection
    public void close() {
        System.out.println("Closing connection");
        try {
            conn.close();
            conn = null;
        } catch (Exception e) {
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public PreparedStatement prepareStatement(String sql) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
