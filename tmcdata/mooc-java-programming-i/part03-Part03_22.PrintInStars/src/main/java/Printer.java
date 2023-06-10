
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printStars(int amount) {
            System.out.println("*".repeat(amount));
        }
    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            printStars(array[i]);
        }
    }

}
