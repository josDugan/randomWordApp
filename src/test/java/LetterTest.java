import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by joseph on 1/20/16.
 */
public class LetterTest {
    private Letter letter;

    @Before
    public void setUp() {
        letter = new Letter();
    }



    @Test
    public void initialSetup() {
        Character aLetter = Character.toLowerCase(letter.getLetter());
        Assert.assertTrue(Character.isLetter(aLetter));
    }
}
