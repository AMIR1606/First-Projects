import java.util.Scanner;
public class OrnekSoru4 {
    public static void main(String[] args) {
        Scanner klaviye = new Scanner(System.in);
        int TM = 0;
            System.out.println("Maas Giriniz");
        int Maas = klaviye.nextInt();

        for (int s = 1; s < 36; s++) {
            TM = TM + Maas;
            System.out.println(s + " Kisinin maas toplami: " + TM);
        }
    }
}