import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
     private Book book;

     private Library library;

     @Before
    public void before() {
//         book1 = new Book("Harry Potter And The Order of The Phoenix", "JK Rowling", "Childrens");
//         book2 = new Book("Incognito: The Secret Lives of The Brain", "David Eagleman", "Science");
         library = new Library();
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



}
