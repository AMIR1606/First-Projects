import java.util.Scanner;
public class asalSayi {
    public static void main(String []args) {
        int i = 2;
        boolean bool = false;
        Scanner input = new Scanner(System.in);
        System.out.println("asallik durmunu incelenecek sayiyi giriniz: ");
        int n = input.nextInt();

        if (n <= 1) {
            System.out.println("Girdiginiz sayi asal degildir.");
            
        } else {

            for (; i < n; i++) {
    
                if (n % i == 0) {
                    bool = false;
                    break;
                } else {
                    bool = true;
                }
            }
            if (bool == false) {
                System.out.println("Girdiginiz sayi asal degildir.");
            } else {
                System.out.println("Girdiginiz sayi asal sayidir.");
            }
        }

    }
}