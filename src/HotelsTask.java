import java.io.IOException;
import java.util.Scanner;

public class HotelsTask {
	
	static void MainMune(){
		System.out.println("Please Choice one Option:");
		System.out.println("1. Create Hotels Table");
		System.out.println("2. Create Room Type Table");
		System.out.println("3. Create Room Table");
		System.out.println("4. Create Guests Table");
		System.out.println("5. Create Employee Type Table");
		System.out.println("6. Create Employee Table");
		System.out.println("7. Exit");
		
		
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
				Room_Type CreateRoomTypeTable = new Room_Type();
				CreateRoomTypeTable.RoomTypeTable();
				break;
				
				
			case 3:
				Rooms CreateRoomTable = new Rooms();
				CreateRoomTable.RoomsTable();
				break;
				
			case 4:
				Guests CreateGuestsTable = new Guests();
				CreateGuestsTable.GuestsTable();
				break;
				
				
			case 5:
				Employee_Type CreateEmployeeTypeTable = new Employee_Type();
				CreateEmployeeTypeTable.EmployeeTypeTable();
				break;
				
			case 6:
				Employees CreateEmployeesTable = new Employees();
				CreateEmployeesTable.EmployeesTable();
				break;
				
			}	
		}
		while (true);

	}

}
