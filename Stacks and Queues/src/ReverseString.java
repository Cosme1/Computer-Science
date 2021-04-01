import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nString input: ");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++){
            System.out.print(stack.pop());
        }
    }
}
