
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int longest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            sum += age;
            count++;
            if (parts[0].length() > longest) {
                longest = parts[0].length();
            }
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + ((double) sum / count));
        scanner.close();
    }
}
