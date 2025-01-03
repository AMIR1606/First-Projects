import java.util.Arrays;
import java.util.Scanner;
public class Odev1c {
    public static void main(String[] args) {
        int dizi [] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + ". Sayiyi girniz: ");
            int giris = input.nextInt();
            dizi[i] = giris;
        }
        Arrays.sort(dizi);
        for (int i = 0; i < 5; i++) {
            System.out.print(dizi[i] + ", ");
        }
        input.close();
    }
}