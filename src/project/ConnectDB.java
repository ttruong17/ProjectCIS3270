package project;
import java.sql.*;

public class ConnectDB {

    public static void main (String a[]) throws ClassNotFoundException, SQLException
    {
        try
        {
            String url = "jdbc:sqlserver://H3ATNATION\\SQLEXPRESS;databaseName=NightClub;integratedSecurity=true;";   
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url);
            System.out.println("connection created");
            Statement st=conn.createStatement();
            String sql="select * from Customer";
            ResultSet rs=st.executeQuery(sql);
            
            //System.out.println(sql);
            //print out CID and FirstName
            //filter fields to print
            while(rs.next())
            {
            	System.out.println("");
                System.out.print("CustomerID: "+rs.getString(1));
                System.out.print("FirstName : "+rs.getString(2));
                //rs.insertRow();
            }
            if(st!=null)
            st.close();
            if(conn!=null)
                conn.close();
        }
        catch(SQLException sqle1)
        {
            System.out.println("Sql exception "+sqle1);
        }
    }

}
