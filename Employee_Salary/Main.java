import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		clearScreen();
		System.out.println("Add Employee\n============= \n");
		System.out.println("Enter Employee Payment Type\n1. Hourly\n2. Salary\n");
		System.out.println("Make Selection -->");
		String payment = input.nextLine();
		int pay = Integer.parseInt(payment);
		if (pay == 1) {
			
		}
		else if (pay == 2) {

		}
		else{

		}
		
	}

	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	} 
}
