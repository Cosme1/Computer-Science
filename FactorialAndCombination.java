import java.util.*;

/**
 * FactorialAndCombination
 */
public class FactorialAndCombination {
    public static void main(String[] args) {
        System.out.println("Do you want to calculate Factorial or Combination");
        Scanner scann = new Scanner(System.in);
        String input = scann.nextLine();
        if (input.equals("Factorial")){
            System.out.println("Type in a number of terms");
            scann = new Scanner(System.in);
            int n = scann.nextInt();
            System.out.println(Factorial(n));
        }
        else if (input.equals("Combination")){
            System.out.println("Type in the number of terms and r");
            scann = new Scanner(System.in);
            int n = scann.nextInt();
            scann = new Scanner(System.in);
            int r = scann.nextInt();
            Combination(n, r);
        }
        else System.out.println("Error, wrong input");

        
    }

    static int Factorial(int n){
        if (n == 0){
            return 1;
        }
        else
            return (n * Factorial(n-1));
    }

    static void Combination(int n, int r){
        int a = Factorial(n);
        int b = Factorial(r);
        int c = Factorial(n - r);
        System.out.println(a/(b*c));
    }
}