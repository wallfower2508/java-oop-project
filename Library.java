import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Registered member: " + member.name);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
