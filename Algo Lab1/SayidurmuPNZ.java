// Girilen bir sayının Pozitif , Negatif veya Sıfır olduğunu inceleyen kod.
import java.util.Scanner;
public class SayidurmuPNZ {

    public static void main(String[] argv) {
       
    Scanner input = new Scanner(System.in);

            System.out.print("Enter your number: ");
        float num = input.nextFloat();
        
    if (num > 0) 
            System.out.println("Positive number");
           
        else if (num < 0) 
            System.out.println("Negative number");
          
        else
            System.out.println("The numer its zero ");       

            input.close();
    }
}