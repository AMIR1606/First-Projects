// Girilen bir sayinin Recursive yontemde fibonacci serisini veren kod
import java.util.Scanner;
public class fiboRecursive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("fibonacci serisi verilecek sayiyi giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacciRecursive(i) + ", ");
        }
        input.close();
    }
    public static int fibonacciRecursive(int n) {

        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}