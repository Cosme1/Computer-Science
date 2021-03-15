import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList Hemployee = new LinkedList<Hourly>();
		LinkedList Semployee = new LinkedList<Salary>();
		char again = 'n';
		clearScreen();
		while (again == 'n'){
			Scanner input = new Scanner(System.in);
			System.out.println("Add Employee\n============= \n");
			System.out.println("Enter Employee Payment Type\n1. Hourly\n2. Salary\n");
			System.out.print("Make Selection -->");
			String payment = input.nextLine();
			int pay = Integer.parseInt(payment);
			if (pay == 1) {
				System.out.print("\nEnter Employee Name -->");
				String name = input.nextLine();
				System.out.println("\nEnter Employee SS# -->");
				String ssNum = input.nextLine();
				System.out.println("\nEnter hourly wage -->");
				String hWage1 = input.nextLine();
				double hWage = Integer.parseInt(hWage1);
				System.out.println("\nEnter hours worked for month -->");
				String hWorkedforMonth1 = input.nextLine();
				double hWorkedforMonth = Integer.parseInt(hWorkedforMonth1);
				Hourly employeeHourly = new Hourly(name, ssNum, hWage, hWorkedforMonth);
				System.out.println("\nEnter another employee[y/n]?");
				String again1 = input.nextLine();
				again = again1.charAt(0);
			}
			else if (pay == 2) {

			}
			else{
				System.out.println("Wrong input, please type in 1 or 2");
			}
		}

		System.out.println("\n \n Salary Summary\n===============");
		System.out.println("Name         = ");
	}

	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	} 
}
