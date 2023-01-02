import java.io.IOException;
import java.util.Scanner;

public class Rooms {

	
	public static void RoomsTable() throws IOException{
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    String sql = "CREATE TABLE Room_Type" + "(id INTEGER PRIMARY KEY ," + "room_type_id INTEGER FOREIGN KEY REFERENCES Rooms(id)," + 
	    	    " hotel_id INTEGER FOREIGN KEY REFERENCES Hotels(id) , "+ " created_date date NOT NULL ," + " updated_date date," + "is_Active BIT NOT NULL )";
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter id :");
	    Integer id = scanner.nextInt();
	    
	    System.out.print("Enter room type id :");
	    Integer room_type_id = scanner.nextInt();
	    
	    System.out.print("Enter hotel id :");
	    Integer hotel_id = scanner.nextInt();
	    
	    System.out.print("Created date :");
	    String created_date = scanner.next();
	    
	    System.out.print("Updated date :");
	    String updated_date = scanner.next();
	    
	    System.out.print("Is Active date :");
	    String is_Active = scanner.next();
	    
	}
}
