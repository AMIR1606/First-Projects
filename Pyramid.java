import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("asss ");
        int n = input.nextInt();

        for (int k = 1; k <= n; k++) {
        
            for (int i = n - k; i > 0; i--) {
                System.out.print(" ");
            }
  
            for (int j = 1; j <= (2 * k - 1); j++) {
                System.out.print("*");
            }
  
            System.out.println();
        }
    }
}
