import java.util.Scanner;

public class Soru18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("yaziyi giriniz: ");
        String giris = input.nextLine();
        
        System.out.println("Aranan yaziyi giriniz: ");
        String aranan = input.nextLine();
        
        int i = giris.indexOf(aranan)+1;
        System.out.printf("Aranan yazi verilen yazida %2d karekterinde basliyor. " , i);
        input.close();
    }
}