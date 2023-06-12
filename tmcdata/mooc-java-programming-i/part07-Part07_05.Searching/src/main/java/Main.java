import java.util.ArrayList;

public class Main {
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (Book book : books) {
            if (book.getId() == searchedId) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0;
        int end = books.size() - 1;
        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (books.get(middle).getId() == searchedId) {
                return middle;
            } else if (books.get(middle).getId() < searchedId) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
