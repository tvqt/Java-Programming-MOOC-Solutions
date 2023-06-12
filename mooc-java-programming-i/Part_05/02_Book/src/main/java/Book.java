public class Book {
    private String name;
    private String author;
    private int pages;

    public Book(String author, String name, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }

    public String toString() {
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}
