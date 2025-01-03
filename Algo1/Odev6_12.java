public class Odev6_12 {
    public static void main(String[] args) {
        int [][] dizi1 = {{100, 20, 300},{44, 55, 666},{7, 80, 9},{10,11,12}};
        int [][] dizi2 = new int [5][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                dizi2[i][j]  = dizi1[i][j];
                dizi2[i][3] += dizi1[i][j];
                dizi2[4][j] += dizi1[i][j];
                dizi2[4][3] += dizi2[i][j];
            }
        }
        for (int i = 0; i < 5; i++){
            System.out.print("[");
            for (int j = 0; j < 4; j++){
                System.out.printf("%6d" , dizi2[i][j]);
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
