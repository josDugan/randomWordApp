import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by joseph on 1/20/16.
 */
public class NumberGeneratorTest {
    private final static int UPPER_BOUND = 26;
    private final static int LOWER_BOUND = 0;
    private final static int OBJECT_UPPER_BOUND = new NumberGenerator(LOWER_BOUND, UPPER_BOUND).getUpperBound();
    private final static int OBJECT_LOWER_BOUND = new NumberGenerator(LOWER_BOUND, UPPER_BOUND).getLowerBound();
    private NumberGenerator numberGenerator;


    @Before
    public void setUp() {
        numberGenerator = new NumberGenerator(OBJECT_LOWER_BOUND, OBJECT_UPPER_BOUND);
    }

    @Test
    public void initialState() {
        Assert.assertEquals(OBJECT_LOWER_BOUND, numberGenerator.getLowerBound());
        Assert.assertEquals(OBJECT_UPPER_BOUND, numberGenerator.getUpperBound());
        Assert.assertTrue(numberGenerator.getNumber() < numberGenerator.getUpperBound() &&
                          numberGenerator.getNumber() >= numberGenerator.getLowerBound());
    }

}
