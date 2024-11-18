import java.util.Scanner;
public class IDDK {
    public static void main(String[] args) {
        float a, b, c, dis;
        Scanner input = new Scanner(System.in);
        System.out.print("a degerini giriniz: ");
        a = input.nextFloat();
        System.out.print("b dagerini giriniz: ");
        b = input.nextFloat();
        System.out.print("c degerini giriniz: ");
        c = input.nextFloat();
        dis = b*b - 4*a*c;
        if (dis < 0) {
            System.out.println("Denklemin koku yoktur.");
        } else if (dis == 0) {
            System.out.println("x1 = x2 = " + -b/(2*a));
        }else {
            System.out.println("x1 = " + ((-b + Math.sqrt(dis)) / (2*a)) + "\nx2 = " + ((-b - Math.sqrt(dis)) / (2*a)));
        }
    }
}