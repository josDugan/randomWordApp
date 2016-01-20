import java.util.Collections;
import java.util.Random;

/**
 * Created by joseph on 1/20/16.
 */
public class NumberGenerator {
    public NumberGenerator(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        number = makeRandomInteger(upperBound);

    }



    private static int makeRandomInteger(int upperBound) {
        int randomNumber = (int)(Math.random() * upperBound);
        return randomNumber;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public int getNumber() {
        return number;
    }

    private int number;
    private int upperBound;
    private int lowerBound;
}
