public class recursion5to1 {
    public static void main(String[] args) {
        int x = 5;
        number(x);
    }
    static void number(int x){
        if (x >= 1){
            System.out.println(x);
            number(x - 1);
        }
    }
}