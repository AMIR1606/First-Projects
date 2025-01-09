/*
Kullancidan ad ve Soyad bilgisini girmesi istenir girilen
ad degiskenindeki karakter sayisi 12'nin tam kati degilse
karakter sayisi 12'nin tam kati olunacaya kadar sonuna * karakteri
eklenir. Soyad degiskenindeki karekter sayisi 12'nin tam kati
degilse karakter sayisi 12'nin tam kati oluncaya kadar sonuna
+ karakteri eklenir. Ad degiskenini bir kare seklinde ve Soyad
degiskenini bie U harfi biciminde ekrana yazdiran program.
*/

import java.util.Scanner;

public class AdSoyadKareUYazdirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Adin gilmesi.
        System.out.println("Adinizi giriniz: ");
        String Ad = input.nextLine();

        //Soyadin girilmesi
        System.out.println("Soyadizi giriniz: ");
        String Soyad = input.nextLine();

        //Adinin 12 katina tmamlama
        while (Ad.length() % 12 != 0) {
            Ad += "*";
        }
        //Soyadinin 12 katina tamamlama
         while (Soyad.length() % 12 != 0) {
            Soyad += "+";
        }
        //bosluk
        System.out.println("\n\n\n");

        //Birinci Satir yazdirma
        int i = 0;
        for (; i < Ad.length() / 4; i++){
        System.out.print(Ad.charAt(i));
        }

        // Alt satira gecme
        System.out.println();

        //Ortak satirlari yazdirma
        for (int k = 0; k < (Ad.length() / 4) - 1; k++){
            //Satirin ilk karakteri yazdirma
            System.out.print(Ad.charAt(i));
            i++;
            //Satirin ortadaki bosluklari yazdirma
            for (int j = 0; j < (Ad.length() / 4) - 2; j++){
                System.out.print(" ");
            }
            //Satirin son harfini yazdirma
            System.out.print(Ad.charAt(i));
            i++;
            //Alt satira gecme
            System.out.println();
        }

        //Son satiri yazdirma
        for (int x = 0; x < Ad.length() / 4; x++, i++) {
            System.out.print(Ad.charAt(i));
        }
        
        //bosluk
        System.out.println("\n\n\n");

        //U'nun ilk Satirlari yazdirma
        int j = 0;
        for (;j < (Soyad.length() / 3) * 2; j++){
            //Satirin birinci karekteri
            System.out.print(Soyad.charAt(j));
            j++;
            //Satirin ortadaki bosluklari
            for (int k = 0; k < (Soyad.length() / 3) - 2; k++) {
                System.out.print(" ");
            }
            //Satiri son karekterini yazdirma
            System.out.print(Soyad.charAt(j));
            //Alt satira gecme
            System.out.println();
            
        }
        //U'nun Son satirini yazdirma
        for (int y = 0; y < (Soyad.length() / 3); y++,j++) {
            System.out.print(Soyad.charAt(j));
        }
    }
}