public class Odev3 {
    public static void main(String[] args) {
        String dizi [] = {"Yaman Akbulut"};

        String[] ad = new String [dizi.length];
        String[] soyad = new String [dizi.length];

        for (int i = 0; i <dizi.length; i++) {
            String[] parca = dizi[i].split(" ");
            ad[i] = parca[0];
            soyad[i] = parca[1];
        }
        for (int i = 0; i < dizi.length; i++)
        System.out.println("Ad: " + ad[i] + "\tSoyad: " + soyad[i]);
    }
}