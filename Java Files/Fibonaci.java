import java.util.*;
import java.util.stream.*;

public class Fibonaci {
    public static void main(String[] args) {
        
        System.out.println("Type how many terms of the Fibonaci sequence you want");
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();
        double newTerm = new Double(terms);
        long array[] = new long[terms];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < terms; i++){
            array[i] = array[i - 2] + array[i - 1]; 
        }
        double average = LongStream.of(array).sum() / newTerm;
        System.out.println("The Fibonaci sequence looks like this: " + Arrays.toString(array));
        System.out.println("The average is: " + average);
    }
    
}
