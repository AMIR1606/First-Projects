import java.util.Scanner;
public class TasKagitMakasOyunu {
    public static void main(String[] args) {
        int bilgisayar = (int) (Math.random () * 3)+ 0;
        Scanner input = new Scanner(System.in);
        System.out.print("tas (0), kagit (1) ve makas (2) hangisi?: ");
        int oyuncu = input.nextInt();
        if (oyuncu == 0){
            if (bilgisayar == 0) {
                System.out.println("Sen tas, bilgisayar tas. Birebir!");
            } else if (bilgisayar == 1) {
                System.out.println("Sen tas, bilgisayar kagit. kaybettin!");
            } else {
                System.out.println("Sen taş, bilgisayar makas. Kazandin!");
            }

        } else if (oyuncu == 1) {
            if (bilgisayar == 0) {
                System.out.println("Sen kagit, bilgisayar tas. Kazandin!");
            } else if (bilgisayar == 1) {
                System.out.println("Sen kagit, bilgisayar kagit. Birebir!");
            } else {
                System.out.println("Sen kagit, bilgisayar makas. Kaybettin!");
            }
        } else if (oyuncu == 2) {
            if (bilgisayar == 0) {
                System.out.println("Sen makas, bilgisayar tas. Kaybettin!");
            } else if (bilgisayar == 1) {
                System.out.println("Sen makas, bilgisayar kagit. Kazandin!");
            } else {
                System.out.println("Sen makas, bilgisayar makas. Birebir!");
            }
        } else {
            System.out.println("Yanlis giris. ");
        }
        System.out.println(bilgisayar);
        input.close();
    }
}