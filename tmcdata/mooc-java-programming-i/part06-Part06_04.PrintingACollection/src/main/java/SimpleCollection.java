
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    @Override
    public String toString() {
        String output = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            output += " is empty.";
        } else {
            output += " has " + this.elements.size() + " element";
            if (this.elements.size() == 1) {
                output += ":";
            } else {
                output += "s:";
            }
            for (String element : this.elements) {
                output += "\n" + element;
            }
        }
        return output;
    }
}
