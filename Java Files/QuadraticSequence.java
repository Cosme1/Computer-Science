import java.util.Arrays;
import java.util.Scanner;

public class QuadraticSequence {
    public static void main(String[] args) {
        clearScreen();

        System.out.println("How many terms do you want inside your sequence?");
        Scanner scanner = new Scanner(System.in);
        /*
        if (scanner.nextInt() <= 1){
            System.out.println("The number of terms need to be higher than 1");
        }
        */
        int terms = scanner.nextInt();
        int array[] = new int[terms];
        System.out.println("Enter the first few terms of your quadratic sequence: ");
        
        for (int i = 0; i < array.length; i++){
            System.out.println("Please enter a number");
            array[i] = scanner.nextInt();
        }
        
        

        int firstdif1 = array[1] - array[0];
        int firstdif2 = array[2] - array[1];
        double secondDiffHalf = firstdif2 - firstdif1;

        double nTerm = secondDiffHalf / 2;
        double nResult1 = nTerm;
        double nResult2 = nTerm * 4;
        double nfinalResult1 = array[0] - nResult1;
        double nfinalResult2 = array[1] - nResult2;
        double finalDifference = nfinalResult2 - nfinalResult1;
        double UnResult = nTerm - finalDifference;
        //int math = Math.(finalDifference *UnResult);
        
        
        /*
        clearScreen();
        System.out.println("Results:");
        System.out.println("Your Sequence is " + Arrays.toString(array));
        System.out.println("The difference of the Sequence is " + difference);
        System.out.println("The fourth term of the Sequence is " + nextTerm);
        System.out.println("The formula of the Sequence is: Un = " + array[0] + "+(n-1)" + difference);
        System.out.println("For example if n = 100, the formula is: U100 = " + array[0] + "+(100-1)" + difference);
        System.out.println("In this case, U100 then equals " + U100);
        scanner.close();
        */

        clearScreen();
        System.out.println("Results: ");
        System.out.println("Your Sequence is " + Arrays.toString(array));
        System.out.println("The Quadratic Sequence is: Un = " + nTerm + "(n-1)" + finalDifference);
        System.out.println("Final Result: Un = " + nTerm + "n^2+" + finalDifference + "n" + "+" + UnResult);
        System.out.println("Debugging: ");
        System.out.println("nTerm = " + nTerm);
        System.out.println("secondDiffHalf = " + secondDiffHalf);
        
    }

    public static void clearScreen() {
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }
}
