// Dışarıdan girilen 10 tabanındaki bir tam sayı değişkeni için eğer girilen değer çift ise 8 tabanına dönüştüren, değilse 2 tabanına dönüştüren program
import java.util.Scanner;
public class OrnekSoru7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("10 tabaninda bir sayi giriniz: ");
        int sayi = input.nextInt();
        String sonuc = "";
        while (sayi > 0) {
            
            if (sayi % 2 == 0) {
                int kalan = sayi % 8;
                sonuc = kalan + sonuc;
                sayi /= 8;
            } else {
                int kalan = sayi % 2;
                sonuc = kalan + sonuc;
                sayi /= 2;
            }
        }
        System.out.println(sonuc);
        input.close();
    }
}