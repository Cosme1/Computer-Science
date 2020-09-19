import java.util.*;

public class Fibonaci {
    public static void main(String[] args) {
        
        System.out.println("Type how many terms of the Fibonaci sequence you want");
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();
        int array[] = new int[terms];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < terms; i++){
            array[i] = array[i - 2] + array[i - 1];
        }
        System.out.println("The Fibonaci sequence looks like this: " + Arrays.toString(array));
    }
}
