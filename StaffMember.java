public class StaffMember extends Member {
    private String position;

    public StaffMember(String id, String name, String position) {
        super(id, name);
        this.position = position;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.borrowBook()) {
            System.out.println(name + " (Staff) borrowed: " + book.getTitle());
        } else {
            System.out.println("Book not available for borrowing.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Staff: " + name + " (Position: " + position + ")");
    }
}
