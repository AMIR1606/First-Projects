import java.util.Scanner;
public class OrnekSoru2 {
    public static void main(String[] args) {
        Scanner klaviye = new Scanner(System.in);
            System.out.println("Sicil No Giriniz: ");
        String Sicil_No = klaviye.nextLine();
            System.out.println("Calisma Saatini Giriniz: ");
        int Calisma_Saati = klaviye.nextInt();
            System.out.println("Saatlik Ucreti Giriniz: ");
        int Saatlik_Ucret = klaviye.nextInt();

        double Maas,Pirim,Vergi,Net_Maas;
        Maas = Calisma_Saati * Saatlik_Ucret;
        Pirim = Maas * 0.14;
        Vergi = Maas * 0.15;
        Net_Maas = Maas - (Pirim + Vergi);
            System.out.println("Sicil No, Pirim, Vergi, Net Maasi: " + Sicil_No + "," + Pirim + "," + Vergi + "," + Net_Maas);
   
            klaviye.close();
        }
}
