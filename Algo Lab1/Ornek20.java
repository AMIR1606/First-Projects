import java.util.Scanner;
public class Ornek20 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Lutfen baslangic, adet ve artis miktarini giriniz giriniz: ");
        int baslangic = giris.nextInt();
        int adet = giris.nextInt();
        int artis = giris.nextInt();
        giris.close();
        for (; adet > 0; adet--) {
            System.out.print(baslangic + ",");
            baslangic += artis;
        }
    }
}