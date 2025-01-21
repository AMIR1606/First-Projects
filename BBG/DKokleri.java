//2.Derceden denklemin degiskenlerin katsayilerini alip kokleri veren kod
import java.util.Scanner;
public class DKokleri{
    public static void main(String []args){
        double a, b, c, dertiminant, x, x1, x2;
        Scanner input = new Scanner(System.in);
        System.out.println("a degerini giriniz: ");
        a = input.nextDouble();
        System.out.println("b degerini giriniz: ");
        b = input.nextDouble();
        System.out.println("c degerini giriniz: ");
        c = input.nextDouble();
        dertiminant = Math.pow(b, 2) - 4*a*c;
        if (dertiminant > 0) {
            x1 = (-b + Math.sqrt(dertiminant)) / 2*a;
            x2 = (-b - Math.sqrt(dertiminant)) / 2*a;
            System.out.println("iki farkli kok vardir:\nKok1 = " + x1 + "\nKok2 = " + x2);
        } else if (dertiminant == 0) {
            x = (-b / 2*a);
            System.out.println("Bir kok vardir:\nkok = " + x);
        } else {
            System.out.println("Reel kok yotur. ");
        }
        input.close();
    }
}