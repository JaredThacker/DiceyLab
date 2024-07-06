import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void createBins() {
        Bins bin = new Bins(2,12);
        bin.createBins();

        Boolean actual = (bin.binMap.size()) == 11;

        Assert.assertTrue(actual);

    }

    @Test
    public void incrementBin() {
        Bins bin = new Bins(2,12);
        bin.createBins();
        bin.incrementBin(5);
        boolean actual = (bin.binMap.get(5)) == 1;
        Assert.assertTrue(actual);
    }

    @Test
    public void getBin() {
        Bins bin = new Bins(2,12);
        bin.createBins();
        bin.incrementBin(3);
        boolean actual = (bin.getBin(3)) == 1;
        Assert.assertTrue(actual);
    }
}