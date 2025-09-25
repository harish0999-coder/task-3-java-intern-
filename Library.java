// Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to library.");
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " registered.");
    }

    public void issueBook(String title, int userId) {
        Book book = findBook(title);
        User user = findUser(userId);

        if (book != null && user != null && !book.isIssued()) {
            book.issueBook();
            user.borrowBook(book);
            System.out.println(book.getTitle() + " issued to " + user.getName());
        } else {
            System.out.println("Book not available or invalid user.");
        }
    }

    public void returnBook(String title, int userId) {
        Book book = findBook(title);
        User user = findUser(userId);

        if (book != null && user != null && book.isIssued()) {
            book.returnBook();
            user.returnBook(book);
            System.out.println(book.getTitle() + " returned by " + user.getName());
        } else {
            System.out.println("Return failed!");
        }
    }

    public void showBooks() {
        System.out.println("\n--- Library Books ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) return book;
        }
        return null;
    }

    private User findUser(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) return user;
        }
        return null;
    }
}
