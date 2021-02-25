/*
    Note: I found the mistake, total counter needs to be double not int
 */

public class Markbook {
    public static void main(String[] args) {
        int marksbook[][] = {{67, 50, 93, 83, 43}, {70, 52, 96, 85, 48}, {90, 81, 100, 93, 68}, {55, 32, 71, 72, 58}, {60, 47, 65, 74, 61}};
        int total = 0;
        int average = 0;
        int counter = 0;
        double studenttotal = 0;
        double studentAverage[] = new double[5];
        char studentName[] = {'A', 'B', 'C', 'D', 'E'};
        double testAverage[] = new double[5];
        double testTotal = 0;
        for (int column = 0; column < 5; column++){
            for (int row = 0; row < 5; row ++){
                total = total + marksbook[column][row];
                counter = counter + 1;
                studenttotal = studenttotal + marksbook[column][row];
                testTotal = testTotal + marksbook[row][column];

                if (row == 4){
                    studentAverage[column] = studenttotal/5;
                    studenttotal = 0;

                }
            }

            testAverage[column] =testTotal/5;
            testTotal = 0;
        }
        average = total/ counter;
        System.out.println("\nOverall average: " + average + "\n");
        for (int i = 0; i < 5; i++){
            System.out.println("Average mark for student " + studentName[i] + " is " + studentAverage[i]);
        }
        System.out.println();
        for  (int i = 0; i < 5; i++){
            System.out.println("Average mark for Test " + (i+1) + " is " + testAverage[i]);
        }
    }
}
