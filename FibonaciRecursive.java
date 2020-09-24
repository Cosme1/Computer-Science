import java.util.*;
import java.util.stream.*;

public class FibonaciRecursive {
    public static void main(String[] args) {
        
        System.out.println("Type how many terms of the Fibonaci sequence you want");
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();
        fibonaci(terms);
        System.out.println(fibonaci(terms));
    }

    static int fibonaci(int x){
        if(x== 0 || x == 1){
            return 1;
        }
        return fibonaci(x - 1) + fibonaci(x - 2);
    }
    
}
