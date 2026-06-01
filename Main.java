public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(
                "Clean Code",
                "Robert C. Martin",
                101);

        Book book2 = new Book(
                "Effective Java",
                "Joshua Bloch",
                102);

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("\nLibrary Books:");
        library.displayBooks();

        System.out.println("\nSearching for Clean Code:");
        library.searchBook("Clean Code");
    }
}
