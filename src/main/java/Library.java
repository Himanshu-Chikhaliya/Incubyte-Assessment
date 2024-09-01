import java.util.HashMap;
import java.util.Map;

public class Library {

    public String name;
    public Map<String,Book> allBook;
    public Map<Long,User> allUser;

    Library(String name){
        this.name = name;
        this.allBook = new HashMap<>();
        this.allUser = new HashMap<>();
    }

    public void isValidName() throws Exception{
        if(this.name == null || this.name.equals("")){
            throw new Exception("Please Enter library name");
        }
        if(this.name.length() < 4){
            throw new Exception("Library name must be more than 3 letters");
        }
    }

    public void addBook(Book book) throws Exception{
        if(!book.isValid()){
            throw new Exception("Please fill all the details");
        }
        if(allBook.containsKey(book.ISBN)){
            throw new Exception("A book has already added");
        }
        this.allBook.put(book.ISBN, book);
    }
}
