import java.util.Scanner;
public class DiziForu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz: ");
        int n = input.nextInt();
        int i = 0;
        if (n <= 0){
            System.out.println("Gecersiz bir dizi boyutu girdiniz. ");
            return;
        }

        int dizi[] = new int[n];

        for (; i < n; i++){
            System.out.println("Dizi elemanlarini giriniz. ");
            dizi[i] = input.nextInt();
        }
        System.out.println(i);

        input.close();
    }
}







//int dizi[] = {12,15,19,17};
//for(int i:diz){
    //  System.out.println(i);
    //}