
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println(String.format("%d is %s than %d.", num1, num1 > num2 ? "greater" : num1 < num2 ? "less" : "equal", num2));  
        scanner.close();  
    }
}
