import java.io.IOException;

public class Guests {
	public static void GuestsTable() throws IOException{
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    String sql = "CREATE TABLE Guests" + "(id INTEGER PRIMARY KEY ," + "guest_name VARCHAR(30) NOT NULL ," + 
	    		 "guest_phone VARCHAR(15) NOT NULL ," + "guest_accompanying_members INTEGER NOT NULL ," +
	    		 "guest_payment_amount INTEGER NOT NULL ," +
	    		 " hotel_id INTEGER REFERENCES Hotels(id) , "+ " created_date date NOT NULL ," + " updated_date date," + "is_Active BIT NOT NULL )";
		
		
		
		
	}
}
