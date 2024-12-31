import java.util.Scanner;
public class Ornek11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen baslangic, adet ve artis miktarini giriniz giriniz: ");
        int baslangic = input.nextInt();
        int adet = input.nextInt();
        int artis = input.nextInt();
        for (; adet > 0; adet--) {
            System.out.print(baslangic + ",");
            baslangic += artis;
        }
        input.close();
    }
}