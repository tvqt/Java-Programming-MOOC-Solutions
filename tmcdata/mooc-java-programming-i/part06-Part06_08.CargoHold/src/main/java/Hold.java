import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> luggage;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.luggage = new ArrayList<>();
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : this.luggage) {
            total += suitcase.totalWeight();
        }
        return total;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.luggage.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.luggage) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        if (this.luggage.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        if (this.luggage.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }
        return this.luggage.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    
}
