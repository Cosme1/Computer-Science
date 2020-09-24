public class Recursion {
    static int n = 0;
    static void mthod(){
        n++;
        if (n <= 3){
            
            System.out.println("N is: " + n);
            mthod();
        }
        
        
    }
    public static void main(String[] args) {
        mthod();
    }

    
}
