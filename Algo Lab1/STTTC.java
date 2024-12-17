//Girilen bir sayinin tek bsamaklarin toplamini, cift basamaklarin toplamini ve arasaindaki farki mutlak degerini ve basamak sayisini veren kod
import java.util.Scanner;
public class STTTC{
    public static void main(String []args) {
        int Ttek = 0, Tcift = 0, fark, j = 0, i;
        Scanner input = new Scanner (System.in);
        System.out.println("Bir sayi giriniz: ");
        int n = input.nextInt();
        while (n > 0) {
            i = n % 10;
            if (i % 2 ==0){
                Tcift = Tcift + i;
            } else {
                Ttek = Ttek + i;
            }
            n = n / 10;
            j++;
        }
        fark = Math.abs(Tcift - Ttek);
        System.out.println("Basamak sayisi = " + j + "\nTek rakamlarin toplami = " + Ttek + "\ncift rakamlarin toplami = " + Tcift + "\nArasindaki fark = " + fark);

        input.close();
    }
}