import java.util.ArrayList;
import java.util.List;

public class Member extends Person implements Borrowable {
    private List<Book> borrowedBooks;

    public Member(String id, String name) {
        super(id, name);
        this.borrowedBooks = new ArrayList<>();
    }

    @Override
    public void borrowBook(Book book) {
        if (book.borrowBook()) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available!");
        }
    }

    @Override
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow this book.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Member: " + name + " (ID: " + id + ")");
    }
}
