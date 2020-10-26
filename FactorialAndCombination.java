import java.util.*;

/**
 * FactorialAndCombination
 */
public class FactorialAndCombination {
    public static void main(String[] args) {
        System.out.println("Do you want to calculate Factorial or Combination or Binomial or Pascal?");
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
            System.out.println(Combination(n, r));
        }
        else if (input.equals("Binomial")){
            System.out.println("Type in n");
            scann = new Scanner(System.in);
            int n = scann.nextInt();
            Binomial(n);
        }
        else if (input.equals("Pascal")){
            System.out.println("How many rows should it have?");
            scann = new Scanner(System.in);
            int n = scann.nextInt();
            PascalTriangle(n);
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

    static int Combination(int n, int r){
        int a = Factorial(n);
        int b = Factorial(r);
        int c = Factorial(n - r);
        return (a/(b*c));
    }

    static void Binomial(int n){
        
        for(int i = 0; i < (n+1); i++){
            System.out.print(Combination(n, i) + "a^" + (n-i) + "b^" + i + " + ");
        }
    }

    static void PascalTriangle(int n){

        for (int i = 1; i <= n; i++){
            
            for(int b = 0; b < n-i; b++){
                System.out.print("	");
            }
            for(int c = 1; c <= i; c++){
				System.out.print(Combination(i-1, c-1) + "\t" + "\t");
            }
            System.out.println("");
        }
    }
}