import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Guests {
	public static void GuestsTable() throws IOException{
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    String sql = "CREATE TABLE Guests" + "(id INTEGER PRIMARY KEY ," + "guest_name VARCHAR(30) NOT NULL ," + 
	    		 "guest_phone VARCHAR(15) NOT NULL ," + "guest_accompanying_members INTEGER NOT NULL ," +
	    		 "guest_payment_amount INTEGER NOT NULL ," +" room_id INTEGER REFERENCES Rooms(id) , "+ 
	    		 " hotel_id INTEGER REFERENCES Hotels(id) , "+ " created_date date NOT NULL ," + " updated_date date," + "is_Active BIT NOT NULL )";
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter id :");
	    Integer id = scanner.nextInt();
	    
	    System.out.print("Enter guest name :");
	    String guest_name = scanner.next();
	    
	    System.out.print("Enter guest phone :");
	    String guest_phone = scanner.next();
	    
	    System.out.print("Guest accompanying members :");
	    Integer guest_accompanying_members = scanner.nextInt();
	    
	    System.out.print("Guest_payment_amount :");
	    Integer guest_payment_amount = scanner.nextInt();
	    
	    System.out.print("Room id :");
	    Integer room_id = scanner.nextInt();
	    
	    System.out.print("Created date :");
	    String created_date = scanner.next();
	    
	    System.out.print("Updated date :");
	    String updated_date = scanner.next();
	    
	    System.out.print("Is Active date :");
	    String is_Active = scanner.next();
		
Connection con = null;
	    
	    
	    try {

	        Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	        DriverManager.registerDriver(driver);
	        con = DriverManager.getConnection(url, user, pass);

	        Statement st = con.createStatement();

	        int m = st.executeUpdate(sql);
	        if (m >=  0)
	            System.out.println(
	                    "inserted successfully : " + sql);
	        else
	            System.out.println("insertion failed");

	        con.close();
	    }
        
	    
	    catch (Exception ex) {
	        // Display message when exceptions occurs
	        System.err.println(ex);
	    }
	    
	}
}