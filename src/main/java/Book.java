import java.time.Year;

public class Book {

    public String ISBN;
    public String title;
    public String author;
    public Year publicationYear;
    public boolean isBorrowed;

    Book(String ISBN, String title, String author, Year publicationYear){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

}
