public class Book {

    private String title;
    private String author;
    private int bookId;
    private boolean available;

    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId +
                ", Title: " + title +
                ", Author: " + author +
                ", Available: " + available;
    }
}
