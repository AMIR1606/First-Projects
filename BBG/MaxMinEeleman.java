import java.util.Scanner;
public class MaxMinEeleman {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();
        
        if (n > 0){

        int dizi[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemani: ");
            dizi[i] = input.nextInt();
        }
        int max = dizi[0], min = dizi[0];

        for (int j = 1; j < dizi.length; j++) {
            if (dizi[j] > max) {
                max = dizi[j];
            }
            if (dizi[j] < min) {
                min = dizi[j];
            }
        }
        System.out.println("En buyuk elemean = " + max);
        System.out.println("En kucuk elemean = " + min);

        } else {
            System.out.println("Gecersiz bir dizi boyutu girdiniz.");
        }
        input.close();
    }
}