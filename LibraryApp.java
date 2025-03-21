public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        // Tambah Buku
        Book book1 = new Book("B001", "Java Programming", "John Doe", 3);
        Book book2 = new Book("B002", "Data Structures", "Alice Smith", 2);
        library.addBook(book1);
        library.addBook(book2);

        // Tambah Member
        Member member1 = new Member("M001", "Alice");
        Member member2 = new Member("M002", "Bob");
        StaffMember staff1 = new StaffMember("S001", "Charlie", "Librarian");

        library.registerMember(member1);
        library.registerMember(member2);
        library.registerMember(staff1);

        // Member Meminjam Buku
        member1.borrowBook(book1);
        member2.borrowBook(book2);
        staff1.borrowBook(book1);

        // Menampilkan Buku yang Tersedia
        library.displayAvailableBooks();

        // Member Mengembalikan Buku
        member1.returnBook(book1);
        library.displayAvailableBooks();
    }
}
