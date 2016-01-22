import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by joseph on 1/20/16.
 *
 */
public class Letter {
    public Letter() {
        letter = generateRandomLetter();
    }

    private static char generateRandomLetter() {
        ArrayList<Character> alphabetArray = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        int randomNumber = new NumberGenerator(LOWER_BOUND, UPPER_BOUND).getNumber();
        char aLetter = alphabetArray.get(randomNumber);

        return aLetter;
    }



    public char getLetter() {
        return letter;
    }

    private char letter;
    private final static int LOWER_BOUND = 0;
    private final static int UPPER_BOUND = 25;

}
