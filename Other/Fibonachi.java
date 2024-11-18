import java.util.Scanner;
public class Fibonachi {
    public static void main(String[] args) {
        int x = 1, y = 1, fibo;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonachi dizisi hesaplanacak sayiyi giriniz: ");
        int num = input.nextInt();
        System.out.printf(x + ", " + y + ", ");
        for(int i = 3; i <= num; i++){
            fibo = x + y;
            System.out.print(fibo + ", ");
            x = y;
            y = fibo;
        }
    }   
}