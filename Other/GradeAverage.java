// Girilen notların ortalamasını veren kod.
import java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args) {
        float sum = 0, grade = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);
    
        while (grade != -1) {
                System.out.println("Enter grade " + (count + 1) + " (or enter -1 to finish): ");
            grade = input.nextFloat();

            if (grade != -1) {
            sum += grade;
            count++;
            }
        }
        if (count == 0 ) {
                System.out.println("Average = 0");
        }
        else {
                System.out.println("Average = " + sum/count );
        }

        input.close();
    }
}