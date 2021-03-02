import java.util.*;

public class GradePercent {
    public static void main(String[] args) {
        System.out.println("How many questions did the test have?");
        Scanner scanner = new Scanner(System.in);
        double questions = scanner.nextDouble();
        System.out.println("How many questions did you get right?");
        scanner = new Scanner(System.in);
        double rightAnswers = scanner.nextDouble();
        
        double percentage = (rightAnswers/questions) * 10;
        int switchPercentage = (int)Math.round(percentage);
        grade(switchPercentage);
    }
    static void grade(int p){
        switch (p) {
            case 8:
                System.out.println("Your grade is 7");
                break;
            case 7:
                System.out.println("Your grade is 6");
                break;
            case 6:
                System.out.println("Your grade is 5");
                break;
            case 5:
                System.out.println("Your grade is 4");
                break;
            case 4:
                System.out.println("Your grade is 3");
                break;
            case 3:
                System.out.println("Your grade is 2");
                break;
            case 2:
                System.out.println("Your grade is 1 or lower");
            default:
                System.out.println("Please type in the correct percentage");
        }
    }
}