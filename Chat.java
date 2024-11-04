import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0, grade = 0;
        int count = 0;

        // Kullanıcı -1 girene kadar notları girmeye devam eder
        while (grade != -1) {
            System.out.print("Enter grade " + (count + 1) + " (or enter -1 to finish): ");
            grade = input.nextFloat();

            if (grade != -1) { // -1 girilmemişse toplama ekler ve sayacı artırır
                sum += grade;
                count++;
            }
        }

        // Ortalama hesaplanır ve ekrana yazdırılır
        if (count > 0) { // En az bir not girildiyse ortalama hesaplanır
            System.out.println("Average = " + (sum / count));
        } else {
            System.out.println("No grades entered.");
        }

        input.close();
    }
}
