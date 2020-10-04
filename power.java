import java.util.*;

public class power {
    public static void main(String[] args) {
        System.out.println("Enter base: ");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        System.out.println("Enter power: ");
        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();
        System.out.println(Power(base, power));
    }

    static int Power(int base,int power){
        if (power == 0){
            return 1;
        }

        return (base * Power(base, (power - 1)));
    }
}
