import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class HotelManagement {

	public void nameEnd() {
		
    	String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMSS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    String sql = "SELECT * FROM Guests WHERE guest_name LIKE'%E'";
	    
	    Connection con = null;

	    try {

	        Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	        DriverManager.registerDriver(driver);
	        con = DriverManager.getConnection(url, user, pass);

	       

	    	PreparedStatement pstmt2 = con.prepareStatement(sql);
	        ResultSet result = pstmt2.executeQuery();
	        
	        
			while (result.next()) {
				
				String guest_name = result.getString("guest_name");
			
				System.out.println(guest_name);
			}
           
	    }
	    
	    
    catch (Exception ex) {
        System.err.println(ex);
    }
		
	    
	}
}


