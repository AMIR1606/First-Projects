import java.util.Scanner;
public class OrnekSoru1 {
    public static void main(String[] args) {
        Scanner klaviye = new Scanner(System.in);
            System.out.println("Sicil No Giriniz: ");
        String Sicil_No= klaviye.nextLine();
            System.out.println("Calisma Saatini Girinz: ");
        int Calisma_Saati=klaviye.nextInt();
            System.out.println("Saatlik Ucreti Giriniz: ");
        int Saatlik_Ucret = klaviye.nextInt();

        int Maas;
        Maas = Calisma_Saati * Saatlik_Ucret;
            System.out.println("Sicil No, Maas: " + Sicil_No + "=" + Maas);
    }
    
}