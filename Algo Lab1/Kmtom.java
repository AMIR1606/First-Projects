//  Girilen mesafenin Kilometreden Metreye dönüştüren kod.
import java.util.Scanner;

public class Kmtom {

    public static void main(String[] args){
        float Mesafe, m;

    Scanner input = new Scanner(System.in);
        System.out.print("Hesaplanacak kilometre uzunlugunuz giriniz: ");
    Mesafe = input.nextFloat();

    m = Mesafe * 1000;
        System.out.printf("%.2f m" , m);

        input.close();
    }
}