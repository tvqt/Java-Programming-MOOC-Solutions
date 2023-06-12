
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static Recipes readRecipesFromFile(String file) {
        Recipes recipes = new Recipes();
        try (Scanner scanner = new Scanner(new File(file))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                recipes.addRecipe(new Recipe(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        Recipes recipes = readRecipesFromFile(file);
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                recipes.printRecipes();
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                recipes.printRecipeName(name);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                recipes.printRecipeTime(maxCookingTime);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipes.printRecipeIngredient(ingredient);
            }
        }
    }

}
