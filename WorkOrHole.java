// Girilen günün tatil yada çalışma günü olduğunu inceleyen kod.
import java.util.Scanner;
public class WorkOrHole {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
            System.out.println("Gunu gir: ");
        String day = input.next();

        switch (day) {

          case "Pazartesi":
          case "Sali":
          case "Carsamba":
          case "Persembe":
          case "Cuma":
            System.out.println("Calisma gunu ");
          break;

          case "Cumartesi":
          case "Pazar":
            System.out.println("Tatil ");
          break;

          default:
            System.out.println("Girilen gun hatali ");
          break;

        }
    }
}