import java.util.Scanner;
public class SayiTahminOyunu {
    public static void main(String[] args) {
        int i = 1, girdi = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Aranin miktarini giriniz: ");
        int miktar = input.nextInt();
        System.out.println("Aranin baslangic degerini giriniz:");
        int baslangic = input.nextInt();
        int rastgeleSayi = (int) (Math.random() * miktar) + baslangic;

        while (girdi != rastgeleSayi) {
            System.out.println("Bir sayi giriniz: ");
            girdi = input.nextInt();

            if ( girdi < baslangic){
                System.out.println("Belirlediginiz alan disinda bir sayi girdiniz.");
            }else if (girdi > miktar+baslangic){
                System.out.println("Belirlediginiz alan disinda bir sayi girdiniz.");
            }

            if (girdi != rastgeleSayi) {
                if (girdi < rastgeleSayi) {
                    System.out.println("Ynlis cevap girdiniz, sayidan kucuktur. bir daha deneyin. ");
                } else {
                    System.out.println("Ynlis cevap girdiniz, sayidan buyuktur. bir daha deneyin. ");
                }
                i++;               
            } else {
                System.out.println("Dogru cevapi girdiniz. " + i + " kere denediniz.");
                break;   
            } 
        }
        input.close();
    }
}