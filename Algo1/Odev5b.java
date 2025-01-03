public class Odev5b {
    public static void main(String[] args) {
        int dizi [][] = {{100,20,300},{44,55,666},{7,80,9},{10,11,12}};
        int min = 10000, max = 0, indisSatirmin = 0,indisSutunmin = 0, indisSatirmax = 0, indisSutunmax = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (min > dizi[j][i]) {
                    min = dizi[j][i];
                    indisSatirmin = j;
                    indisSutunmin = i;
                }
                if (max < dizi[j][i]) {
                    max = dizi[j][i];
                    indisSatirmax = j;
                    indisSutunmax = i;
                }
            }
        }
        System.out.printf("En kucuk eleman = %d \tsayinin satiri: %d  \tSayinin sutunu: %d" , min, indisSatirmin, indisSutunmin);
        System.out.printf("\nEn buyuk eleman = %d \tsayinin satiri: %d  \tSayinin sutunu: %d" , max, indisSatirmax, indisSutunmax);
    }
}