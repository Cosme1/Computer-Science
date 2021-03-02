import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        System.out.println("Enter no. of elements");
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        int[] array = new int[n];
        System.out.println("Enter all numbers");
        for (int i=0; i < n; i++){
            array[i] = scann.nextInt();
        }
        
        reverse(array);
    }

    static void reverse(int[] array){
        for (int i = 1; i <= array.length; i++){
            System.out.print(array[(array.length-i)] + " ");
        }
    }
}
