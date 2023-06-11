import java.util.ArrayList;
public class Package {
    private int weights;
    private ArrayList<Gift> gifts;
    
    public Package() {
        this.weights = 0;
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.weights += gift.getWeight();
        this.gifts.add(gift);
    }

    public int totalWeight() {
        return this.weights;
    }
}
