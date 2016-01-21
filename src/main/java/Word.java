

/**
 * Created by joseph on 1/19/16.
 */
public class Word {
    private final static int LOWER_BOUND = 0;
    private final static int UPPER_BOUND = 23;

    public Word(char leadingLetter) {
        this.randomWord = makeWord(leadingLetter);
    }

    private static String makeWord(char leadingLetter) {
        StringBuilder sb = new StringBuilder();
        int remainingLength = new NumberGenerator(LOWER_BOUND, UPPER_BOUND).getNumber();

        sb.append(leadingLetter);

        for (int i = 0; i < remainingLength; i++) {
            char letter = new Letter().getLetter();
            sb.append(letter);
        }

        return sb.toString();
    }

    public String getRandomWord() {

        return randomWord;
    }

    private String randomWord;
}
