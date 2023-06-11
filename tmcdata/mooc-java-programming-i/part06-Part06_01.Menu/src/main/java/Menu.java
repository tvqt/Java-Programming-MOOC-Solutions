
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        // add meal to list if it is not already there
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }
    public void printMeals() {
        // print all meals using the print command
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        // clear the menu
        this.meals.clear();
    }
}
