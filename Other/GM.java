import java.util.Scanner;
public class GM {
    public static void main(String[] args) {
        int maas;
        Scanner input = new Scanner(System.in);
        System.out.print("Satis miktarini griniz: ");
        int satis = input.nextInt();
        if (satis < 50) {
            maas = 15 + satis * 1;
        } else {
            maas = 15 + 50 * 2 + (satis-50) * 3;
        }
        System.out.println("Gunluk ucret = " + maas + " TL");
    }   
}