// Main.java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("Java Basics", "James Gosling"));
        library.addBook(new Book("Effective Java", "Joshua Bloch"));

        // Register users
        library.registerUser(new User("Alice", 1));
        library.registerUser(new User("Bob", 2));

        // Show available books
        library.showBooks();

        // Issue a book
        library.issueBook("Java Basics", 1);

        // Show books after issuing
        library.showBooks();

        // Return a book
        library.returnBook("Java Basics", 1);

        // Show books after returning
        library.showBooks();
    }
}
