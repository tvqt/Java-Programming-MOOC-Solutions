
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        int sum = 0; 
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double average = (double) sum / list.size();
        System.out.println("Average: " + average);
        scanner.close();
    }
}
