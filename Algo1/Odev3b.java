import java.util.Scanner;

public class Odev3b {
    public static void main(String[] args) {
        String dizi1[] = new String[2];
        String dizi2[] = new String[2];
        Scanner input = new Scanner(System.in);
        String Ad = "", Soyad = "";
       
        for (int i = 0; i < 2; i++){

            System.out.println("Adinizi giriniz: ");
            Ad = input.nextLine().trim();

            System.out.println("Soyadinizi giriniz: ");
            Soyad = input.nextLine().trim();
            //String[] parts = Soyad.split("\\s+");
    
            dizi1[i] = Ad;
            dizi2[i] = Soyad;
        }
        for (int i = 0; i < 2; i++){
            System.out.printf("\nSayin %s %s" ,dizi1[i], dizi2[i]);
        }
        input.close();
    }
}