import java.util.ArrayList;

public class Birds {
    private ArrayList<Bird> birds;

    public Birds() {
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
        System.exit(1);
    }
}
