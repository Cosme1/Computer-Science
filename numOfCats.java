import java.util.*;

public class numOfCats {
    public static void main(String[] args) {
        System.out.println("Enter number of cats: ");
        Scanner scanner = new Scanner(System.in);
        
        int numOfEyes = scanner.nextInt();
        System.out.println(CatEyes(numOfEyes));
    }

    static int CatEyes (int x){
        if (x == 0)
            return 0;
        
        return (2 + CatEyes(x-1));
        
    }
}
