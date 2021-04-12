import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void shouldReturnTrue(){
        String word = "kayak";
       Assertions.assertTrue(Main.checkIfIsPalindrome(word));
    }

    @Test
    void shouldReturnFalse(){
        String word = "abcdea";
        Assertions.assertFalse(Main.checkIfIsPalindrome(word));
    }
}
