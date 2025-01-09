import java.util.Scanner;
import java.util.StringTokenizer;

public class Odev3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Ad = "";
        for (int i = 0; i < 2; i++){
            System.out.println("Adinizi giriniz: ");
            Ad = input.nextLine();
            StringTokenizer son = new StringTokenizer(Ad, " ");
            System.out.print("Sayin ");
            while (son.hasMoreTokens()) {
                System.out.print(son.nextToken() + " ");
            }
            System.out.println();
        }
        input.close();
    }
}