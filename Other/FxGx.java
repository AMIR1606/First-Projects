// Girilen bir sayinin F(x) ve G(x) hesaplayan kod.
import java.util.Scanner;
public class FxGx {
    public static void main(String[] args) {
        double f, g, x;
        Scanner input = new Scanner(System.in);
        System.out.print("x degerini giriniz: ");
        x = input.nextDouble();
        if (x > 0.0){
            f = 1.0 / (1.0 + Math.log(x));
            g = 1.0 / (x + Math.log(x));
        } else {
            f = 1.0 / (1.0 + x*x);
            g = 1.0 / (1.0 + x + x*x);
        }
        System.out.printf("F(X) = " + f + "\nG(x) = " + g);

        input.close();
    }
}