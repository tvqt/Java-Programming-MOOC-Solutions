
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Give me the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Give me the third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("The sum of the numbers is " + (firstNumber + secondNumber + thirdNumber));
        scanner.close();
    }
}
