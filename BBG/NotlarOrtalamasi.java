/* 
Öğrenci sayısını alıp girilen öğrencilerin vize ve final notlarını son notlarını ve geçip geçmediklerini
inceleyerek bütün notların ortalamasını ve en büyük not ile en küçük notu hesaplayan kod
Not: Vize notunun yüzde kırkı ve finalın yüzde altmışı alınmaktadır. Geçma notu 50.
Finalın notu 50'den küçükse öğrenci geçmez. Notların puanları 100'den oalcaktır.
*/  
import java.util.Scanner;
public class NotlarOrtalamasi {
    public static void main(String[] args) {
        double toplam = 0;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("\nogrenci sayisini giriniz: ");
        n = input.nextInt();
        if(n <= 0) {
            System.out.println("En az bir ogrenci olmali. ");
            return;
        }
        double dizi[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\n" + (i + 1) + ". Ogrencinin vize notunu giriniz: ");
            double Vize = input.nextDouble(); 
            if (Vize < 0 || Vize > 100) {
                System.out.println("Yanlis not girdiniz. ");
                return;
            }
            System.out.print(i + 1 + ". Ogrencinin final notunu giriniz: ");
            double Final = input.nextDouble();
            if (Final < 0 || Final > 100) {
                System.out.println("Yanlis not girdiniz. ");
                return;
            }
            dizi[i] = (Vize * 0.4) + (Final * 0.6);
            if (Final < 50){
                System.out.println(i + 1 + ". Ogrencinin notu = " + dizi[i] + "\tKaldi");
            }
            else {
                if (dizi[i] >= 50){
                    System.out.println(i + 1 + ". Ogrencinin notu = " + dizi[i] + "\tGecti");
                } else {
                    System.out.println(i + 1 + ". Ogrencinin notu = " + dizi[i] + "\tKaldi");
                }
            }
            toplam += dizi[i];
        }
        double max = dizi[0], min = dizi[0];
        for (int k = 0; k < n; k++){
            if (dizi[k] > max) {
                max = dizi[k];
            }
            if (dizi[k] < min){
                min = dizi[k];
            }
        }
        System.out.println("\nNotlarin ortalamasi = " + toplam / n);
        System.out.println("\nEn yuksek not = " + max);
        System.out.println("En dusuk not = " + min);
        input.close();
    }
}