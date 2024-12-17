import java.util.Scanner;
public class OrnekSoru6 {
    public static void main(String[] args) {
        Scanner klaviye = new Scanner(System.in);
            System.out.println("Cinsiyeti Giriniz: ");
        String cinsiyet = klaviye.nextLine();
            System.out.println("Adim Sayisini Giriniz: ");
        int adimSayisi = klaviye.nextInt();
        int kalori;
        if (cinsiyet.equals("Kadin")) {
            kalori = adimSayisi * 30 / 500;
        } else {
            kalori = adimSayisi * 45 / 500;
        }
            System.out.println("Yakilan Kalori Miktari: " + kalori);
  
            klaviye.close();
        }
}