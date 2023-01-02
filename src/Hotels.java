import java.util.Scanner;

public class Hotels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    String sql = "CREATE TABLE Hotels" + "(id INTEGER NOT NULL ," + "hotel_name VARCHAR(30) NOT NULL , " + "hotel_location VARCHAR(30),"
	    + " created_date date NOT NULL , " + " updated_date date," + "is_Active BIT NOT NULL " + " PRIMARY KEY ( id ))";
	    
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter id :");
	    Integer id = scanner.nextInt();
	    
	    System.out.print("Enter hotel name :");
	    String hotel_name = scanner.next();
	    
	    System.out.print("Enter hotel location :");
	    String hotel_location = scanner.next();
	    
	    System.out.print("Created date :");
	    String created_date = scanner.next();
	    
	    System.out.print("Updated date :");
	    String updated_date = scanner.next();
	    
	    System.out.print("Is Active date :");
	    String is_Active = scanner.next();
	    
	    
	    
	    
	}

}
