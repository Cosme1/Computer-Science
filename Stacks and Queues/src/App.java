public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();
        String buildstack[] = new String[100];
        String buildqueue[] = new String[100];

        System.out.println("\nStack:");
        for (int i = 0; i < buildstack.length; i++){
            stack.push("Person " + i);
        }

        for (int i = 0; i < buildstack.length; i++){
            System.out.println(stack.pop());
        }

        System.out.println("\nQueue:");
        for (int i = 0; i < buildqueue.length; i++){
            queue.enqueue("Person " + i);
        }

        for (int i = 0; i < buildqueue.length; i++){
            System.out.println(queue.dequeue());
        }
    }
}
