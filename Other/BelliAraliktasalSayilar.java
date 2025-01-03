// Verilen iki sayinin arasindaki asal olan sayilari veren program
import java.util.Scanner;
public class BelliAraliktasalSayilar {
    public static void main(String[] args) {
        boolean bool = false;
        Scanner input = new Scanner(System.in);
        System.out.println("baslangic sayisini giriniz: ");
        int A = input.nextInt();

        System.out.println("BItis degerini giriniz: ");
        int B = input.nextInt();
        input.close();    

        for(; A <= B; A++) {
        if (A <= 1) {
            System.out.println(A + " Sayisi asal degildir.");
            A++;
        }
        if (A == 2){
            System.out.println(A + " Sayisi asal sayidir.");
            continue;
        }        
        for (int i = 2; i < A; i++) {   
            if (A % i == 0) {
                    bool = false;
                    break;
            } else {
                    bool = true;
            }
        }
            if (bool == false) {
                System.out.println(A + " Sayisi asal degildir.");
            } else {
                System.out.println(A + " Sayisi asal sayidir.");
            }
        }
    }
}