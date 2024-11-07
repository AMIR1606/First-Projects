// Girilen üç sayının en büyüğünü veren kod.
import java.util.Scanner;

public class EBsayi {

    public static void main(String []args) {

    float Bigger, a, b, c;

    Scanner input = new Scanner(System.in);

            System.out.print("Enter your First number: ");
        a = input.nextFloat();

            System.out.print("Enter your Second number: ");
        b = input.nextFloat();

            System.out.print("Enter your Third number: ");
        c = input.nextFloat();

        if ( c > a && c > b ) {
        Bigger = c;
        }
        else if ( b > a && b > c ) {
        Bigger = b;
        }
        else {
        Bigger = a;
        }

            System.out.print("The bigger number is = " + Bigger);
        
    }
    
}