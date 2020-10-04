import java.util.*;

public class MobilePhones {
    static int numOfSpeakers = 0;
    public static void main(String[] args) {
        int numOfPhones;
        System.out.println("Number of Phones: ");
        Scanner scan = new Scanner(System.in);
        numOfPhones = scan.nextInt();
        System.out.println(speaker(numOfPhones));
    }

    static int speaker(int numOfPhones){
        
        if (numOfPhones == 0)
            return 0;

        if (numOfPhones % 2 == 0){
            numOfSpeakers = numOfSpeakers + 2;
            speaker (numOfPhones - 1);
        }
        else {
            numOfSpeakers++;
            speaker(numOfPhones - 1);
        }

        return (speaker(numOfPhones - 1));
    }
}
