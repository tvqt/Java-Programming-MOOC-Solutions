import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Birds birds = new Birds();
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine().toLowerCase();
            if (command.equals("add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                birds.addBird(name, latinName);
            } else if (command.equals("observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                birds.observation(name);
            } else if (command.equals("all")) {
                birds.all();
            } else if (command.equals("one")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                birds.printOneBird(name);
            } else if (command.equals("quit")) {
                break;
            }
        }
    scan.close();
    }
}
