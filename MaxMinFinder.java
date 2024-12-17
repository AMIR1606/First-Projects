import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Dizinin eleman sayisini giriniz: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Hata. Geçerli bir dizi boyutu giriniz.");
            return;
        }

        int numbers[] = new int[n];

        System.out.println("Dizinin elemanlarini giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". elemani: ");
            numbers[i] = scanner.nextInt();
        }
        
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("En büyük değer: " + max);
        System.out.println("En küçük değer: " + min);

        scanner.close();
    }
}
