import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            Book book = new Book(name, publicationYear);

            boolean inBooks = false;
            for (Book b : books) {
                if (b.equals(book)) {
                    System.out.println("The book is already on the list. Let's not add the same book again.");
                    inBooks = true;
                    break;
                }
            }
            if (!inBooks) {
                books.add(book);
            }
        }
        scanner.close();

        System.out.println("Thank you! Books added: " + books.size());
    }
}
