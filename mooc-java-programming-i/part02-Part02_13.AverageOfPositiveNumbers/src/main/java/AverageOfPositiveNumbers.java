
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        while (true) {
            System.out.println("Give a number:");
            double input = Double.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else if (input > 0) {
                count++;
                sum += input;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + (sum / count));
        }
        scanner.close();
    }
}
