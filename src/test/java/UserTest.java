import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserTest {

    @Test
    void verifyUser(){
        User user = new User(123,"Himanshu");
        assertEquals(123,user.ID);
        assertEquals("Himanshu",user.name);
        assertNotEquals(12,user.ID);
        assertNotEquals("shyam",user.name);
    }

}
