
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Give the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + ((double) firstNumber / secondNumber));
        }
}
