// Girilen bir sayinin Iterative yontemde fibonacci serisini veren kod
import java.util.Scanner;
public class FiboIterative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("fibonacci serisi verilecek sayiyi giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacciIterative(i) + ", ");
        }
    }
    public static int fibonacciIterative(int n) {

        if (n <= 1) {
            return n;
        }
        int oncekiSayi = 0, sonrakiSayi = 1;
        for (int i = 2; i <= n; i++) {
            int gecici = sonrakiSayi;
            sonrakiSayi += oncekiSayi;
            oncekiSayi = gecici;
        }
        return sonrakiSayi;
    }
}