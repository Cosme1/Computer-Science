public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();
        String buildstack[] = new String[100];
        String buildqueue[] = new String[100];

        for (int i = 0; i < buildstack.length; i++){
            stack.push("Person " + i);
        }

        for (int i = 0; i < buildstack.length; i++){
            System.out.println(stack.pop());
        }
    }
}
