package project;
import java.sql.*;

public class ConnectDB {

	public ConnectDB() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
    public static void main(String a[]) throws ClassNotFoundException, SQLException
    {
        try
        {
            String url = "jdbc:sqlserver://localhost;databaseName=NightClub;integratedSecurity=true";   
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url);
            System.out.println("connection created");
            Statement st=conn.createStatement();
            String sql="select * from NightClub";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                System.out.println("Name: "+rs.getString(1));
                //System.out.println("Address : "+rs.getString(2));
            }
            if(st!=null)
            st.close();
            if(conn!=null)
                conn.close();
        }
        catch(SQLException sqle)
        {
            System.out.println("Sql exception "+sqle);
        }
    }	//this will connect to the database
	public Connection connect() {
		return null;
	}

}
