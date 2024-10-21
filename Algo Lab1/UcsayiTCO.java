import java.util.Scanner;

public class UcsayiTCO{

    public static void main(String args[]) {
      float a, b, c;
    
    Scanner Ucsayi = new Scanner(System.in);

      System.out.print("Birinci sayi: ");
    a = Ucsayi.nextInt();

      System.out.print("ikinci sayi: ");
    b = Ucsayi.nextInt();

      System.out.print("ucuncu sayi: ");
    c = Ucsayi.nextInt();
    
      System.out.printf("Toplam = %.2f%n Carpim =  %.2f%n Ortalama = %.2f" , a +b +c, a*b*c, (a+b+c)/3);

  }

}