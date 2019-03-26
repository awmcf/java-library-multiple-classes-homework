import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(200);
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.currentBooks());
    }

    @Test
    public void cannotAddBook() {
        library = new Library(1);
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.currentBooks());
    }
}
