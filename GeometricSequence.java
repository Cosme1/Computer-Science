import java.util.Arrays;
import java.util.Scanner;

public class GeometricSequence {
    public static void main(String[] args) {
        clearScreen();

        
        System.out.println("How many terms do you want inside your sequence?");
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();
        int array[] = new int[terms];
        System.out.println("Enter the first few terms of your arithmetic sequence: ");
        
        for (int i = 0; i < array.length; i++){
            System.out.println("Please enter a number");
            array[i] = scanner.nextInt();
        }
        
        int difference = array[1] - array[0];
        int nextTerm = array[2] + difference;
        int U100 = array[0] + 99 * difference;
        
        clearScreen();
        System.out.println("Results:");
        System.out.println("Your Sequence is " + Arrays.toString(array));
        System.out.println("The difference of the Sequence is " + difference);
        System.out.println("The fourth term of the Sequence is " + nextTerm);
        System.out.println("The formula of the Sequence is: Un = " + array[0] + "+(n-1)" + difference);
        System.out.println("For example if n = 100, the formula is: U100 = " + array[0] + "+(100-1)" + difference);
        System.out.println("In this case, U100 then equals " + U100);
        scanner.close();
    }

    public static void clearScreen() {
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }
}
