
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give speed: ");
        int speed = scanner.nextInt();
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
        scanner.close();

    }
}
