package QATraining.FinalProject;

import java.time.LocalDate;
import java.util.Scanner;

public class Choices {

	private static Scanner sc = new Scanner(System.in);

	public String getInput() {
		System.out.println("Enter CRUD choice: ");
		return sc.nextLine();
	}

	public void options() {
		// create an instance of the CRUD queries class to open the connection
		CRUDqueries q = new CRUDqueries();

		// Ask for user input on the CRUD choice in the getInput method and store the
		// result in the crud variable
		String crud = getInput();

		// try-finally block so the finally block can close the connection
		try {
			// do-while loop to start the loop and present the options to interact with the
			// database
			do {
				// switch case to match which CRUD operation to perform
				switch (crud.toLowerCase()) {
				case "create":
					
					Strike strike = new Strike();
					
					System.out.println("Enter Date and Time: (YYYY-MM-DD HH:MM:SS)");
					String date = sc.nextLine();
					//LocalDate formateDate = LocalDate.parse(date);
					strike.setDateOfStrike(date);
					
					System.out.println("Enter Location: ");
					String location = sc.nextLine();
					strike.setLocation(location);
					
					System.out.println("Enter Leader: ");
					String leader = sc.nextLine();
					strike.setLeader(leader);

					System.out.println("Enter Trade Union: ");
					String tradeUnion = sc.nextLine();
					strike.setTradeUnion(tradeUnion);
					
					System.out.println("Enter Work Area: ");
					String workArea = sc.nextLine();
					strike.setWorkArea(workArea);
					
					System.out.println("Enter Capacity:");
					int capacity = sc.nextInt();
					sc.nextLine();
					strike.setCapacity(capacity);
				
					q.create(strike);
					//q.create(new Vehicle(mod, miles, vType, door));
					break;
				case "read":
					
					q.view();
					break;
				case "update":
					System.out.println("Enter id of record to update: ");
					int uid = sc.nextInt();
					sc.nextLine();//capture enter key
					
					
					System.out.println("Entre feature to update: (Date, Location, Leader, Trade Union, Work Area, Capacity)");
					String feature = sc.nextLine();
					
					System.out.println("Enter the new " + feature + " of the vehicle: ");
					String value = sc.nextLine();
					
					q.update();					
					break;
				case "delete":
					System.out.println("Enter id of record to delete: ");
					int id = sc.nextInt();
					sc.nextLine();//capture enter key
					q.delete(id);
					break;
				case "search":
					System.out.println("Enter id of record to view:");
					int id2 = sc.nextInt();
					sc.nextLine();
					//q.readById();
					break;
				default:
					System.out.println("Invalid CRUD choice");
				}
				// check if user wants to continue or break out of the loop
				System.out.println("Would you like to continue? (y/n)");
				String quit = sc.nextLine();
				if (quit.toLowerCase().equals("y")) {
					crud = getInput();
				} else if (quit.toLowerCase().equals("n")) {
					crud = "quit";
				} else {
					System.out.println("Please enter 'y' or 'n'");
				}

			} while (!crud.equals("quit"));
			System.out.println("Goodbye!");
		} finally {
			q.closeConn();
		}
	}

	
}
