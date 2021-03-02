public class BubbleSort {
    
    public static void main(String[] args) {
        int array[] = {3, 60, 35, 2, 45, 320, 5};
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        bubble(array);
        System.out.println();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
static void bubble(int arr[]){
        int temp;
        for (int i = 0; i < arr.length; i++){
            System.out.println();
            for (int j = 0; j < arr.length-i-1; j++){
                System.out.println();
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.print(arr[j] + " " + arr[j+1]);
                    
                }

            }
        }
        
    }
    
}
