
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Give the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Give the third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("The average is " + ((double) (firstNumber + secondNumber + thirdNumber) / 3));
        scanner.close();
        
    }
}
