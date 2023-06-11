public class Book {
    private String title;
    private int pages;
    private int publication_year;
    public Book(String title, int pages, int publication_year) {
        this.title = title;
        this.pages = pages;
        this.publication_year = publication_year;
    }
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public int getPublicationYear() {
        return publication_year;
    }
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publication_year;
    }
}
