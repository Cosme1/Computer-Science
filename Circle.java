import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        findRadius(radius);
        findParameter(radius);
    }

    public static void findRadius(int r){
        double ans = Math.PI * r * r;
        System.out.println("The radius is " + ans);
        
    }

    public static void findParameter(int r){
        double ans = 2 * Math.PI * r;
        System.out.println("The circumference is " + ans);
    }
}
