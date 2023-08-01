import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    private Book book;

    private Library library;

    @Before
    public void before() {
        book = new Book("Harry Potter And The Order of The Phoenix", "JK Rowling", "Childrens");
        library = new Library(1);
        borrower = new Borrower();
                library.addBook(book);
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, borrower.getCollectionSize());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(book);
        library.removeBook(book);
        assertEquals(1, borrower.getCollectionSize());
        assertEquals(0, library.countStock());

    }


}
