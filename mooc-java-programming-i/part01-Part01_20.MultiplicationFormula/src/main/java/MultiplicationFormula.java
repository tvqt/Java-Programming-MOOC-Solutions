
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Give me the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
    }
}
