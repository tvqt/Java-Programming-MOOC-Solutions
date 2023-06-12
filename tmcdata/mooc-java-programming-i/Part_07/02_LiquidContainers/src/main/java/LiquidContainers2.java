
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] splitInput = input.split(" ");
            String operation = splitInput[0];
            int amount = Integer.valueOf(splitInput[1]);

            if (operation.equals("add")) {
                first.add(amount);
            } else if (operation.equals("move")) {
                first.move(amount, second);
            } else if (operation.equals("remove")) {
                second.remove(amount);
            }
        }
        scan.close();
    }

}
