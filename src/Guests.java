import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class Guests {
	public static void GuestsTable() throws IOException{
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMSS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    String sql = "CREATE TABLE Guests" + "(id INTEGER PRIMARY KEY ," + "guest_name VARCHAR(30) NOT NULL ," + 
	    		 "guest_phone VARCHAR(15) NOT NULL ," + "guest_accompanying_members INTEGER NOT NULL ," +
	    		 "guest_payment_amount INTEGER NOT NULL ," +" room_id INTEGER REFERENCES Rooms(id), "+ 
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

	    System.out.print("Hotel_id :");
	    Integer hotel_id = scanner.nextInt();

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

	        
	     // Executing query
            int m = st.executeUpdate(sql);
            if (m >=  0)
                System.out.println(
                        "Create successfully : " + sql);
            else
                System.out.println("Create failed");

            // Closing the connections
            con.close();
            
            
	    }
        
	    
	    catch (Exception ex) {
	        // Display message when exceptions occurs
	        System.err.println(ex);
	    }}

	
	
	    public static void insertIntoTable(){
	    	String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMSS;encrypt=true;trustServerCertificate=true";
			String user = "sa";
		    String pass = "root";
		    
	    Scanner scanner = new Scanner(System.in);
	    
	   
	    String guest_name = "Reem" ;
	    String guest_phone = "968-12345678";
	    int guest_accompanying_members = 12;
	    int guest_payment_amount = 112;
	    int room_id = 3;
	    int hotel_id = 1234;
	    String created_date = "2023-01-06";
	    String updated_date = "2023-01-08";
	    boolean is_Active = true;
	    

	    System.out.print("How many num of rows you be insert ? ");
	    Integer insert = scanner.nextInt();
		Random rn = new Random();
		Integer numberToAdd = rn.nextInt(100);
	    
	 // Inserting data using SQL query
	    for(int i=0; i<=insert;i++) {
        String sqlData = "insert into Guests values( "+i+ numberToAdd +", '"+ guest_name +i+"' ,'" + guest_phone + "', "+guest_accompanying_members+", "+guest_payment_amount+", "+room_id+" , "+hotel_id+", '"+created_date+"','"+updated_date+"' , '"+is_Active+"')";
        
 
        Connection con = null;
	    
	    
	    try {

	        Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	        DriverManager.registerDriver(driver);
	        con = DriverManager.getConnection(url, user, pass);

	        Statement st = con.createStatement();

	        
	     // Executing query
            int m = st.executeUpdate(sqlData);
            if (m >=  0)
                System.out.println(
                        "inserted successfully : " + sqlData);
            else
                System.out.println("insertion failed");

            // Closing the connections
            con.close();
            
            
	    }
        
	    
	    catch (Exception ex) {
	        // Display message when exceptions occurs
	        System.err.println(ex);
	    }
	    
	    }}
}
	
//	public static void readFromTable() {
//		// taking input with Scanner 
//		int userInput = 100; // <= maybe user wants 100 employee_type
//		String sql = "SELECT TOP " + userInput + " FROM Employee_Type;";
//		// Connection, Driver, Driver Register
//		try {
//			 Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//		        DriverManager.registerDriver(driver);
//		        
//		ResultSet rs = statement.executeQuery(sql); //ran the Q like sql
//		
//		
//		}
//		 catch (Exception ex) {
//		        // Display message when exceptions occurs
//		        System.err.println(ex);
//		    }
	
	
