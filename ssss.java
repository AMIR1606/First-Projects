import java.util.Scanner;
public class ssss {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi griniz: ");
        int n = input.nextInt();
        
        for(int k = 1; k <= n; k++){
            for (int i = n; i >= k; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * k - 1); j++) {
                System.out.println("*");
            }
            
            System.out.println();
        }
    }
}