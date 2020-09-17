import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        

        for (int i = 0; i < 20; i++){
            System.out.println("The area of the circle is " + findRadius(i));
            System.out.println("The parameter of the circle is " + findParameter(i));
        }
    }

     static double findRadius(double r){
        double ans = Math.PI * r * r;
        return ans;
        
    }

     static double findParameter(double r){
        double ans = 2 * Math.PI * r;
        return ans;
    }
}
