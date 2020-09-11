package ComputerScience;
import java.util.Scanner;

public class GeometricSequence {
    public static void main(String[] args) {
        System.out.println("Enter the first term of your arithmetic sequence: ");
        Scanner sc = new Scanner(System.in);
        double u1 = sc.nextDouble();

        System.out.println("Enter the second term of your arithmetic sequence: ");
        sc = new Scanner(System.in);
        double u2 = sc.nextDouble();

        System.out.println("Enter the thrid term of your arithmetic sequence: ");
        sc = new Scanner(System.in);
        double u3 = sc.nextDouble();

        System.out.println("Sequence is " + u1 + ", " + u2 + ", " + u3);
    }
}
