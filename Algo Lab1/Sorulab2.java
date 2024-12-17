import java.util.Scanner;
public class Sorulab2 {
    public static void main (String[] args) {
        int aralik, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen makine sayisini griniz: ");
        int MS = input.nextInt();
        System.out.println("Lutfen ay numarasini giriniz: ");
        int AY = input.nextInt();

        if (AY > 2 && AY < 9 ){
            i = 480;
            aralik = 45;
        } else {
            i = 540;
            aralik = 30;
        }
        for (; MS > 0; MS--){
            System.out.print(i+", ");
            i = i - aralik;
        }

        input.close();
    }
}