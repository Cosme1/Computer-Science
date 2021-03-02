import java.util.*;

public class MobilePhones {
    public static void main(String[] args) {
        System.out.println("Number of Phones: ");
        Scanner scan = new Scanner(System.in);
        int numOfPhones = scan.nextInt();
        System.out.println(speaker(numOfPhones));
    }

    static int speaker(int numOfPhones){
        
        if (numOfPhones == 0)
            return 0;

        if (numOfPhones % 2 == 0){
            return (2 + speaker (numOfPhones - 1));
        }
        else {
            return (1 + speaker(numOfPhones - 1));
        }
    }
}
