import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class Room_Type {

	
	public static void RoomTypeTable() throws IOException {
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMSS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    String sql = "CREATE TABLE Room_Type" + "(id INTEGER PRIMARY KEY IDENTITY(1,1) ," + "room_type_name VARCHAR(30) NOT NULL , " + 
	    " created_date date , " + " updated_date date," + "is_Active tinyint NOT NULL )";
	    
	 
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
	    
	    String room_type_name = "Roze" ;
	    String created_date = "2022-12-12";
	    String updated_date = "2023-01-08";
	    int is_Active = 0;
	    
	    
	    System.out.print("How many num of rows you be insert ? ");
	    Integer insert = scanner.nextInt();
		Random rn = new Random();
		Integer numberToAdd = rn.nextInt(100);
		
		
		 // Inserting data using SQL query
	    for(int i=0; i<=insert;i++) {
        String sqlData = "insert into Room_Type values('"+ room_type_name+"' , '"+created_date+"','"+updated_date+"' , "+is_Active+")";
        
 
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
