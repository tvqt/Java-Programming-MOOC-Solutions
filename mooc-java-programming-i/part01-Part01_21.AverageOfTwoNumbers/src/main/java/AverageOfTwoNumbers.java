
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Give me the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("The average is " + ((double) (firstNumber + secondNumber) / 2));
        scanner.close();
    }
}
