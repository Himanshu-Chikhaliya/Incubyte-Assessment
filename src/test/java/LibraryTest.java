import org.junit.jupiter.api.Test;

import java.time.Year;

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



    /* --------------------- Test cases for Add Book  -------------------- */
    @Test
    void TheBookDetailsAreNotComplete(){
        Book book1 = new Book("","Vevishal","zaverchand meghani", Year.of(1955));
        Exception ex1 = assertThrows(Exception.class, () -> library.addBook(book1));
        assertEquals("Please fill all the details", ex1.getMessage());
    }

    @Test
    void allDetailsAreCompleted(){
        Book book2 = new Book("9781981876037","Vevishal","zaverchand meghani",Year.of(1955));
        assertDoesNotThrow(() -> library.addBook(book2));
    }

    @Test
    void bookIsAlreadyAdded() throws Exception {
        Book book2 = new Book("9781981876037","Vevishal","zaverchand meghani",Year.of(1955));
        library.addBook(book2);
        Exception ex2 = assertThrows(Exception.class, () -> library.addBook(book2));
        assertEquals("A book has already added",ex2.getMessage());
    }

}
