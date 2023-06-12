import java.util.ArrayList;

public class Recipes {
    private ArrayList<Recipe> recipes;

    public Recipes() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }

    public void printRecipes() {
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    public void printRecipeName(String name) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void printRecipeTime(int maxCookingTime) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void printRecipeIngredient(String ingredient) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    
}
