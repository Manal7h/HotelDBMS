import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Room_Type {

	
	public static void RoomTypeTable() throws IOException {
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    String sql = "CREATE TABLE Room_Type" + "(id INTEGER NOT NULL ," + "room_type_name VARCHAR(30) NOT NULL , " + 
	    " created_date date , " + " updated_date date," + "is_Active BIT NOT NULL " + " PRIMARY KEY ( id ))";
	    
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter id :");
	    Integer id = scanner.nextInt();
	    
	    System.out.print("Enter room type name :");
	    String room_type_name = scanner.next();
	    
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