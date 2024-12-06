import java.util.Scanner;
public class Dongu {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi griniz: ");
        int n = input.nextInt();
        for (int i=0; i <= n; i++) {
            for(int k = 0; k < n - i; k++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}