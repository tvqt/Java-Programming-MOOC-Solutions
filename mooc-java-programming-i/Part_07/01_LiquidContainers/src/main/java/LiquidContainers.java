import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidContainer first = new LiquidContainer();
        LiquidContainer second = new LiquidContainer();

        while (true) {
            System.out.println("First: " + first.getVolume() + "/100");
            System.out.println("Second: " + second.getVolume() + "/100");

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
    }
}
