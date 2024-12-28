public class IkiBoyutluDizi {
    public static void main(String[] args) {
        /*
        int array [][] = new int [3][3];
        array [0][0] = 1;
        array [0][1] = 2;
        array [0][2] = 3;
        array [1][0] = 4;
        array [1][1] = 5;
        array [1][2] = 6;
        array [2][0] = 70;
        array [2][1] = 8;
        array [2][2] = 9;
        */
        int array [][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }
    }
    
}
