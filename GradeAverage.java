import java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    float sum = 0, i = 0;
    int count = 0;
    while (i != -1) {

        System.out.println("Enter grade " + (count + 1) + " (or enter -1 to finish): ");
    i = input.nextFloat();

    if (i != -1) {
        sum += i;
        count++;
    }
    
}
        System.out.println("Average =" + sum/count);
 
}

}