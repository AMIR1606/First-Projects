import java.util.Scanner;
public class tttt {
    public static void main(String []args) {
        int y = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("4 ile 8 arasinda bir sayi giriniz: ");
        int sayi = input.nextInt();

        for (int i = 0; i < sayi; i++){
            int x = 10;
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