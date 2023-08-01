import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
     private Book book;

     private Library library;

     @Before
    public void before() {
//
         library = new Library(1);
     }

     @Test
    public void libraryStartsEmpty() {
         assertEquals(0, library.countStock());
     }

     @Test
    public void canAddBook() {
         Book book1 = new Book("Harry Potter And The Order of The Phoenix", "JK Rowling", "Childrens");
         library.addBook(book1);
         assertEquals(1, library.countStock());

     }

     @Test
    public void cannotAddBookWhenAtCapacity () {
         Book book = new Book("Harry Potter And The Order of The Phoenix", "JK Rowling", "Childrens");
         Book book2 = new Book("Incognito: The Secret Lives of The Brain", "David Eagleman", "Science");
         library.addBook(book);
         library.addBook(book2);
         assertEquals(1, library.countStock());
     }

    @Test
    public void canRemoveBook() {
        Book book = new Book("Harry Potter And The Order of The Phoenix", "JK Rowling", "Childrens");
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0, library.countStock());

    }

}
