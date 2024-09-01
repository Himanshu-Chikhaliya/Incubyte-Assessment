import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LibraryTest {

    Library library = new Library("LDCE");

    @Test
    void isValidName(){
        assertDoesNotThrow(()->library.isValidName());

        Library library1 = new Library("LD");
        Exception ex1 = assertThrows(Exception.class, library1::isValidName);
        assertEquals("Library name must be more than 3 letters",ex1.getMessage());

        Library library2 = new Library("");
        Exception ex2 = assertThrows(Exception.class, library2::isValidName);
        assertEquals("Please Enter library name", ex2.getMessage());

    }

}
