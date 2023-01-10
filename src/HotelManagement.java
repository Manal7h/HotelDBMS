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
			public void guestsPaying()	{
				
		    	String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMSS;encrypt=true;trustServerCertificate=true";
				String user = "sa";
			    String pass = "root";
			    
			    String sql = "SELECT * FROM Guests WHERE (guest_payment_amount>1000)";
			    
			    
			    Connection con = null;	
			    try {

			        Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			        DriverManager.registerDriver(driver);
			        con = DriverManager.getConnection(url, user, pass);
			        
			    	PreparedStatement pstmt2 = con.prepareStatement(sql);
			        ResultSet result = pstmt2.executeQuery();
			        
			        
					while (result.next()) {
						
//						int guest_payment_amount = result.getInt("guest_payment_amount");
//						System.out.println(guest_payment_amount);
						
						int id = result.getInt(1);
						String guest_name = result.getString(2);
						String guest_phone = result.getString(3);
						int guest_accompanying_members = result.getInt(4);
						int guest_payment_amount = result.getInt(5);
						int room_id = result.getInt(6);
						int hotel_id = result.getInt(7);
						Date create_date = result.getDate(8);
						Date update_date = result.getDate(9);
						String is_Active = result.getString(10);
						
						
						System.out.println("\n " + "Id :" + id + "\n " + "Guest name :" + guest_name + "\n " +
						        "Guest phone Number :" + guest_phone + "\n " + "Guest Accompanying Members :"
								+ guest_accompanying_members + "\n " + "Guest Payment Amount :" + guest_payment_amount
								+ "\n " + "Room ID :" + room_id + "\n " + "Hotel ID :" + hotel_id + "\n "
								+ "Created Date :" + create_date + "\n " + "Updated date : " + update_date 
								+ "\n " + "Is Active : " + is_Active);
						
						
					}
			    }
			       catch (Exception ex) {
			           System.err.println(ex);
			       }
    
	}
			
				public void countGuests()	{
				
		    	String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMSS;encrypt=true;trustServerCertificate=true";
				String user = "sa";
			    String pass = "root";
			    
			    String sql = "	SELECT COUNT(room_type_name) AS Count_of_guests FROM Room_Type WHERE room_type_name= 'DELUXE'";
			    
			    Connection con = null;	
			    try {

			        Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			        DriverManager.registerDriver(driver);
			        con = DriverManager.getConnection(url, user, pass);
			        
			    	PreparedStatement pstmt2 = con.prepareStatement(sql);
			        ResultSet result = pstmt2.executeQuery();
			        
			        while (result.next()) {
			        	

						String room_type_name = result.getString(1);

						

						System.out.println("Count of guests who are staing in 'DELUXE' rooms : "+" " + room_type_name);
			        	
			        	
			        	
			        }
			        
			    
				}
			       catch (Exception ex) {
			           System.err.println(ex);
			       }
			
				}	
				
				
				
				
				public void nameA()	{
					
			    	String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMSS;encrypt=true;trustServerCertificate=true";
					String user = "sa";
				    String pass = "root";
				    
				    String sql = " SELECT * FROM Guests WHERE guest_name LIKE '%A%'";
				    
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


