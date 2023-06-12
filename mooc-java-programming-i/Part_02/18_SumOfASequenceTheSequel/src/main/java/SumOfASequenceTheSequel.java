
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}
