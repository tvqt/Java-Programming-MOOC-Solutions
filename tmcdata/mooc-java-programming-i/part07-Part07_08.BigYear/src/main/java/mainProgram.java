import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    private ArrayList<Bird> birds;

    public mainProgram() {
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }

    public void observation(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void all() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }

    public void printOneBird(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void quit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        mainProgram program = new mainProgram();
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equals("add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                program.addBird(name, latinName);
            } else if (command.equals("observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                program.observation(name);
            } else if (command.equals("all")) {
                program.all();
            } else if (command.equals("one")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                program.printOneBird(name);
            } else if (command.equals("quit")) {
                scan.close();
                program.quit();
            }
        }
    }
}
