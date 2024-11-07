// Girilen 35 Maaşın toplamını hesaplayan kod.
import java.util.Scanner;
public class MT35 {
    
    public static void main(String[] args) {

    float sum = 0, maas = 0;
    int count = 1;

        while (count <= 35 ){

        Scanner input = new Scanner(System.in);
            System.out.println((count) + ". Maasi gir: " );
        maas = input.nextFloat();
        
        sum = sum + maas;
        count++;

        }
            System.out.println("maaslarin toplami = " + sum);

    }

}