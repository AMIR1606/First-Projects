public class Ornek7_12 {
    public static void main(String[] args) {
        int [] deste = new int[52];
        String [] gruplar = {"Kupa", "Karo", "Maca", "Sinek"};
        String [] siralar = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Vale", "Kiz", "Papaz"};
        for (int i = 0; i < deste.length; i++) {
            deste[i] = i;
        }
        for (int i = 0; i < deste.length; i++) {
            int j = (int) (Math.random() * deste.length);
            int gecici = deste[i];
            deste [i] = j;
            deste[j] = gecici;
        }
        for (int i = 0; i < 4; i++) {
            String grup = gruplar[deste[i] / 13];
            String sira = siralar[deste[i] % 13];
            System.out.println("Kart numarasi " + deste[i] + ": " + sira + " - " + grup);
        }
    }
}
