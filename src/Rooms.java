import java.io.IOException;

public class Rooms {

	
	public static void RoomsTable() throws IOException{
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    String sql = "CREATE TABLE Room_Type" + "(id INTEGER PRIMARY KEY ," + "room_type_id INTEGER FOREIGN KEY REFERENCES Rooms(id)," + 
	    	    " hotel_id INTEGER FOREIGN KEY REFERENCES Hotels(id) , "+ " created_date date NOT NULL ," + " updated_date date," + "is_Active BIT NOT NULL )";
		
	}
}
