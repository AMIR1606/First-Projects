import java.util.Scanner;
public class OrnekSoru8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Baslangic degerini girniz: ");
        int baslangic = input.nextInt();
        System.out.print("adet miktarini giriniz: ");
        int adet = input.nextInt();
        System.out.print("artis miktarini giriniz: ");
        int artis = input.nextInt();

        while (adet > 0) {
            System.out.println(baslangic);
            baslangic += artis;
            adet--;
        }
    }
}
