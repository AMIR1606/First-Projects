import java.util.Scanner;
public class Matris {
    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Matrisin satir sayisi giriniz: ");
        int sayi = input.nextInt();

        for (int i = 0; i < sayi; i++){
            int x = 10, y = 2;
            x = x*(i+1);
            System.out.println("\n");
            
            for (int j = 0; j < 4; j++){
                System.out.print(x + "\t");
                x -= y;
            }
            y += 1;
        }
    }
}