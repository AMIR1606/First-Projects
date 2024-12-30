import java.util.Scanner;
public class Ornek11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayi girniz: ");
        int a = input.nextInt();
        System.out.println("ikinci sayiyi giriniz: ");
        int b = input.nextInt();

        int ebob = 0;
        for (int i = 2; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Sayilarin ebob'u = " + ebob);
    }
}
