import java.util.Scanner;

public class GradeOfStudent {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

            System.out.print("Notu giriniz: ");
        int not = input.nextInt();
        
    if (not >= 90 && not <= 100) 
            System.out.println("A");
        
        else if (not >= 80 && not < 90)
            System.out.println("B");
        
        else if (not >= 70 && not < 80)
            System.out.println("C");

        else if (not >= 60 && not < 70)
            System.out.println("D");

        else if (not >= 0 && not < 60)
            System.out.println("F");

        else 
            System.out.println("Girdiginiz sayi not degil. ");

    }

}