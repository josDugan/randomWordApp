import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by joseph on 1/20/16.
 */
public class WordTest {
    private final static char LEADING_LETTER = 'a';
    private Word word;

    @Before
    public void setUp() {
        word = new Word(LEADING_LETTER);
    }

    @Test
    public void initalState() {
        String randomWord = word.getRandomWord();
        Assert.assertTrue(!randomWord.isEmpty());
        Assert.assertTrue(randomWord.length() > 0);
    }

}
