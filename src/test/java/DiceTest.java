import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void tossAndSum() {
        Dice dice = new Dice(1);
        int actual = dice.tossAndSum();
        boolean expected = (actual >= 1 && actual <= 6);
        Assert.assertTrue(expected);
    }
}