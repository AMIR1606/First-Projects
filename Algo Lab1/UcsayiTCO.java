// Girilen üç sayının Toplamı, Çarpımı ve Ortalamaı veren kod.
import java.util.Scanner;
public class UcsayiTCO{

    public static void main(String args[]) {
      float a, b, c;
    
    Scanner input = new Scanner(System.in);

      System.out.print("Birinci sayi: ");
    a = input.nextInt();

      System.out.print("ikinci sayi: ");
    b = input.nextInt();

      System.out.print("ucuncu sayi: ");
    c = input.nextInt();
    
      System.out.printf("Toplam = %.2f%n Carpim =  %.2f%n Ortalama = %.2f" , a +b +c, a*b*c, (a+b+c)/3);

      input.close();
    }
}