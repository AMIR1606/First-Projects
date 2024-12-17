import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        char bolme = '/', carpma = '*', toplama =  '+', cikarma = '-';
        Scanner input = new Scanner(System.in);

        System.out.println("\nBirnici sayiyi giriniz: ");
        double i = input.nextDouble();

        System.out.println("islem turunu giriniz: +, -, *, / ");
        String giris = input.next();
        char islem = giris.charAt(0);

        System.out.println("ikinci sayiy girirniz: ");
        double j = input.nextDouble();

        if (islem == bolme) {
            if (j == 0){
                System.out.println("Hata: Bir sayi 0'a bolunmez. ");
            }else {
            System.out.println(i + " / " + j + " = " + (i / j));
            }
        } else if (islem == carpma) {
            System.out.println(i + " * " + j + " = " + (i * j));
        } else if (toplama == islem) {
            System.out.println(i + " + " + j + " = " + (i + j));
        } else if (islem == cikarma) {
            System.out.println(i + " - " + j + " = " + (i - j));
        } else {
            System.out.println("yanlis islem girdiniz.");
        }
        input.close();
    }
}