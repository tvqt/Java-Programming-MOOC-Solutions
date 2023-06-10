
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        while (true) {
            System.out.println("Give a number:");
            double input = Double.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            count++;
            sum += input;
        }
        System.out.println("Average of the numbers: " + (sum / count));
        scanner.close();

    }
}
