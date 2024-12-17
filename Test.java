import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ogrenci sayisini giriniz: ");
        int n = input.nextInt();
        int dizi[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Vize notunu giriniz. Ogrenci" + i + 1);
            dizi [i] =input.nextInt();
            
        }
        input.close();
    }
}