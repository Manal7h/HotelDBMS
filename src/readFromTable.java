import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class readFromTable {

	public static void readFromTable(){
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMSS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    
	    System.out.print("How many num of rows you want to print : ");
	    Integer print = scanner.nextInt();
	    int count = 0;
	    String sql = " SELECT * FROM Hotels " ;
	    
	    Connection con = null;
	    
	    try {

	        Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	        DriverManager.registerDriver(driver);
	        con = DriverManager.getConnection(url, user, pass);

	        Statement st = con.createStatement();
	        
	        ResultSet result = st.executeQuery(sql); //ran the Q like sql
	        
	        while (result.next() && count < print) {
				int id = result.getInt("id");
				String HotelName = result.getString("hotel_name");
				String HotelLocation = result.getString("hotel_location");
				Date created_date = result.getDate("created_date");
				Date updated_date = result.getDate("updated_date");
				boolean is_Active = result.getBoolean("is_Active");
				System.out.println(id + " " + HotelName + " " + HotelLocation + " " + created_date + " " + updated_date + " " + is_Active);
				count++;
			}
			con.close();

	    }
        catch (Exception ex) {
	        // Display message when exceptions occurs
	        System.err.println(ex);
	    }
	}
	
	
	
	public static void getById() {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMSS;encrypt=true;trustServerCertificate=true";
        String user = "sa";
        String pass = "root";
        
        
        Connection con = null;
        
        
        try {
            Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            DriverManager.registerDriver(driver);
            con = DriverManager.getConnection(url, user, pass);
            
            
            Statement st = con.createStatement();
            
            
            Scanner scanner = new Scanner(System.in);
            
            
        	System.out.println("Enter id  that you want search about it ? ");
        	
        	
            int inputId =scanner.nextInt();
            int count=0;
            
            
            String sql="select * from Hotels where id='"+inputId+"'";
            
            
            ResultSet result = st.executeQuery(sql);
            
            
            while (result.next()&&count<=inputId) {
            	
            	 int id=result.getInt("id");
            	 
                 String hotel_name=result.getString("hotel_name");
                 String hotel_location= result.getString("hotel_location");
                 Date created_date= result.getDate("created_date");
                 Date updated_date= result.getDate("updated_date");
                 String is_Active=result.getString("is_Active");
                 
                 System.out.println(id +" "+hotel_name+" "+hotel_location+" "+created_date+" "+updated_date+" " +is_Active);
                 count++;
            }
            
        }
        
        catch (Exception ex) {
            System.err.println(ex);
        }	
	}

}
