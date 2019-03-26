import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Sapiens", "Yuval Noah Harari", "non-fiction");
    }

    @Test
    public void hasTitle() {
        assertEquals("Sapiens", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Yuval Noah Harari", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("non-fiction", book.getGenre());
    }
}