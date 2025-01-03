import java.util.Scanner;
public class Faktoriyel{
    public static void main(String[] args) {
        int faktoriyel = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoryeli hesaplanacak sayiyi giiniz: ");
        int num = input.nextInt();
        input.close();
        for(;num > 0; num--){
            faktoriyel = faktoriyel * num;
        }
        if(num < 0){
            System.out.println("0'dan kucuk olan sayilarin faktoriyeli yok.");
        }else {
            System.out.println("Sayin faktoriyeli = " + faktoriyel);
        }
    }
}