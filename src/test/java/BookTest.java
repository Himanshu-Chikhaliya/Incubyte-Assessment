import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Year;

public class BookTest {

    @Test
    void verifyBook(){
        Book book = new Book("9780684839349","Gitanjali","Rabindranath Tagore", Year.of(1910));
        assertEquals("9780684839349",book.ISBN);
        assertEquals("Gitanjali",book.title);
        assertEquals("Rabindranath Tagore",book.author);
        assertEquals(Year.of(1910),book.publicationYear);
    }

}
