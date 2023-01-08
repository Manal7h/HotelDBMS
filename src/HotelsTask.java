import java.io.IOException;
import java.util.Scanner;

public class HotelsTask {
	
	static void MainMune(){
		System.out.println("Please Choice one Option:");
		
		System.out.println("1. Create Hotels Table");
		System.out.println("2. Insert Into Hotels Table");
		
		
		System.out.println("                                 ");
		
		
		
		System.out.println("3. Create Room Type Table");
		System.out.println("4. Insert Into Room Type Table");
		
		System.out.println("                                 ");
		
		System.out.println("5. Create Room Table");
		System.out.println("6. Insert Into Room Table");
		
		System.out.println("                                 ");
		
		System.out.println("7. Create Guests Table");
		System.out.println("8. Insert Into Guests Table");
		
		System.out.println("                                 ");
		
		System.out.println("9. Create Employee Type Table");
		System.out.println("10. Insert Into Employee Type Table");
		
		System.out.println("                                 ");
		
		System.out.println("11. Create Employee Table");
		System.out.println("12. Insert Into Employee Table");
		
		System.out.println("                                 ");
		
		System.out.println("13. Read From Hotels Table");
		System.out.println("14. getById ");
		
		System.out.println("15. Exit");
		
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		MainMune();
		do {
			int select = sc.nextInt();
			switch(select) {
			
			case 1:
				Hotels CreateHotelsTable = new Hotels();
				CreateHotelsTable.HotelsTable();
				
				break;
				
			case 2:
				Hotels HotelsTable = new Hotels();
				HotelsTable.insertIntoTable();
				
				break;
				
			case 3:
				Room_Type CreateRoomTypeTable = new Room_Type();
				CreateRoomTypeTable.RoomTypeTable();
				break;
				
			case 4:
				Room_Type RoomTypeTable = new Room_Type();
				RoomTypeTable.insertIntoTable();
				break;	
				
			case 5:
				Rooms CreateRoomTable = new Rooms();
				CreateRoomTable.RoomsTable();
				break;
				
			case 6:
				Rooms RoomTable = new Rooms();
				RoomTable.insertIntoTable();
				break;	
				
			case 7:
				Guests CreateGuestsTable = new Guests();
				CreateGuestsTable.GuestsTable();
				break;
					
			case 8:
				Guests GuestsTable = new Guests();
				GuestsTable.insertIntoTable();
				break;
				
			case 9:
				Employee_Type CreateEmployeeTypeTable = new Employee_Type();
				CreateEmployeeTypeTable.EmployeeTypeTable();
				break;
				
			case 10:
				Employee_Type EmployeeTypeTable = new Employee_Type();
				EmployeeTypeTable.insertIntoTable();
				break;			
						
			case 11:
				Employees CreateEmployeesTable = new Employees();
				CreateEmployeesTable.EmployeesTable();
				break;
				
			case 12:
				Employees EmployeesTable = new Employees();
				EmployeesTable.insertIntoTable();
				break;	
				
				
			case 13:
				readFromTable readHotels = new readFromTable();
				readHotels.readFromTable();
				break;	
				
			case 14:
				readFromTable ById = new readFromTable();
				ById.getById();
				break;	
			
				
			}	
		}
		while (true);

	}

}
