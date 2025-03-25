import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) throws InvalidBookException {
        if (book == null) {
            throw new InvalidBookException("Book should not be null");
        }
        books.add(book);
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String title) throws EmptyLibraryException, BookNotFoundException {
        if (books.isEmpty()) {
            throw new EmptyLibraryException("Library is empty, no books to borrow");
        }

        Book book = findBook(title);
        if (book == null) {
            throw new BookNotFoundException("Book with title '" + title + "' not found");
        }

        System.out.println("Book borrowed successfully: " + book.toString());
    }

    public void returnBook(String title) throws BookNotFoundException {
        Book book = findBook(title);
        if (book == null) {
            throw new BookNotFoundException("Book with title '" + title + "' not found");
        }

        System.out.println("Book returned successfully: " + book.toString());
    }

    public void listBooks() throws EmptyLibraryException {
        if (books.isEmpty()) {
            throw new EmptyLibraryException("Library is empty");
        }

        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}