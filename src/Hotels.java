import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class Hotels {

	public static void HotelsTable() throws IOException {
		
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMSS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    String sql = "CREATE TABLE Hotels" + "(id INTEGER PRIMARY KEY IDENTITY(1,1) ," + "hotel_name VARCHAR(30) NOT NULL , " + "hotel_location VARCHAR(30),"
	    + " created_date date NOT NULL , " + " updated_date date," + "is_Active tinyint NOT NULL  )";
	    
	    
//	    Scanner scanner = new Scanner(System.in);
//	    System.out.print("Enter id :");
//	    Integer id = scanner.nextInt();
//	    
//	    System.out.print("Enter hotel name :");
//	    String hotel_name = scanner.next();
//	    
//	    System.out.print("Enter hotel location :");
//	    String hotel_location = scanner.next();
//	    
//	    System.out.print("Created date :");
//	    String created_date = scanner.next();
//	    
//	    System.out.print("Updated date :");
//	    String updated_date = scanner.next();
//	    
//	    System.out.print("Is Active date :");
//	    String is_Active = scanner.next();
//	    
	    
	 
	    Connection con = null;
	    
	    
	    try {

	        Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	        DriverManager.registerDriver(driver);
	        con = DriverManager.getConnection(url, user, pass);

	        Statement st = con.createStatement();

	        int m = st.executeUpdate(sql);
	        if (m >=  0)
	            System.out.println(
	                    "Create successfully : " + sql);
	        else
	            System.out.println("Create failed");

	        con.close();
	    }
        
	    
	    catch (Exception ex) {
	        // Display message when exceptions occurs
	        System.err.println(ex);
	    }
	    

	}
	
	public static void insertIntoTable() {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMSS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    Scanner scanner = new Scanner(System.in);
	    
		   
	    String hotel_name = "JW" ;
	    String hotel_location = "Oman";
	    String created_date = "2022-11-06";
	    String updated_date = "2023-01-08";
	    int is_Active = 1;
		
	    System.out.print("How many num of rows you be insert ? ");
	    Integer insert = scanner.nextInt();
		Random rn = new Random();
		Integer numberToAdd = rn.nextInt(100);
	    
	 // Inserting data using SQL query
	    for(int i=0; i<=insert;i++) {
        String sqlData = "insert into Hotels (hotel_name ,hotel_location,created_date,updated_date,is_Active) values('"+ hotel_name +"' ,'" + hotel_location + "', '"+created_date+"','"+updated_date+"' , "+is_Active+")";
        
 
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
    	    
    	    }
	    }
    }
