import java.util.Arrays;
public class Ornek5d {
    public static void main(String[] args) {
        int[][] dizi = {{100, 20, 300},{44, 55, 666},{7, 80, 9},{10,11,12}};
        for (int[] i : dizi) {
            Arrays.sort(i);
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%6d" ,dizi[i][j]);
            }
            System.out.print("]");
            System.out.println();
        }
    }
}