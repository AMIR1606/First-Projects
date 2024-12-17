import java.util.Scanner;
public class SK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Karekoku alinacak sayiyi giriniz: ");
        int num = input.nextInt();
        if (num < 0){
            System.out.println("Negatif sayi girdiniz.");
        } else {
            System.out.println("Sayin karekoku = " + Math.sqrt(num));
        }
        input.close();
    }
}