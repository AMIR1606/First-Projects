public class Odev5c {
    public static void main(String[] args) {
        int[][] dizi = {{100, 20, 300},{44, 55, 666},{7, 80, 9},{10,11,12}};
        int satirDizi [] = new int [12];
        int sutunDizi [] = new int [12];
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    satirDizi [i++] = dizi[j][k];
                }
            }
        }
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    sutunDizi [i++] = dizi[k][j];
                }
            }
        }
        for (int i: satirDizi){
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i: sutunDizi){
            System.out.println(i + ", ");
        }
    }
}