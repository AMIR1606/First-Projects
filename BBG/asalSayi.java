import java.util.Scanner;
public class asalSayi {
    public static void main(String []args) {
        int i = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("asallik durmunu incelenecek sayiyi giriniz: ");
        int n = input.nextInt();

        for (; i < n; i++) {
           // for (; j < i; j++){
                if (n % i == 0) {
                    System.out.println("asal sayi degildir.");
                    //break;
                } 
                //else {
                    System.out.println("girdiginiz sayi asal sayidir.");
                   // break;
               // }
          //  }
        }
    }
}