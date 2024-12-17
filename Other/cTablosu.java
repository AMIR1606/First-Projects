import java.util.Scanner;
public class cTablosu {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("sayi griniz: ");
        int n = input.nextInt();
        System.out.print("carpim tablosu:\n  \t");
        for (int k = 1; k <= n; k++){
            System.out.print(k + "\t");
        }
        System.out.println("\n");

        for (int i = 1; i <= n; i++) {

            System.out.print(i + " |\t");           
            for(int j = 1; j <= n; j++){       
                    System.out.print(i*j + "\t");                   
            }

            System.out.println();
        }
        input.close();
    }
}