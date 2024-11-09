import java.util.Scanner;
import java.util.Objects;
public class OrnekSoru3 {
    public static void main(String[] args) {
        Scanner klaviye = new Scanner(System.in);
            System.out.println("A Sayisini Giriniz: ");
        double A = klaviye.nextDouble();
            System.out.println("B Sayisini Giriniz: ");
        double B = klaviye.nextDouble();

        if (Objects.equals(A, B)) {
            System.out.println("A Esit B");
        }
        else if (A > B) {
            System.out.println("A Buyuktur");
        }
        else {
            System.out.println("B Buyuktur");
        }
    }    
}