package seminars.third.hw;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class NumberTest {
    @Test
    public void testEvenNumber() {
        Assert.assertTrue(NumberUtil.evenOddNumber(2));
        Assert.assertTrue(NumberUtil.evenOddNumber(10));
        Assert.assertTrue(NumberUtil.evenOddNumber(100));
    }
    @Test
    public void testOddNumber() {
        Assert.assertFalse(NumberUtil.evenOddNumber(1));
        Assert.assertFalse(NumberUtil.evenOddNumber(7));
        Assert.assertFalse(NumberUtil.evenOddNumber(99));
    }

    @Test
    public void testZero() {
        Assert.assertTrue(NumberUtil.evenOddNumber(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        Assert.assertTrue(NumberUtil.evenOddNumber(-2));
        Assert.assertTrue(NumberUtil.evenOddNumber(-10));
        Assert.assertTrue(NumberUtil.evenOddNumber(-100));
    }

    @Test
    public void testNegativeOddNumber() {
        Assert.assertFalse(NumberUtil.evenOddNumber(-1));
        Assert.assertFalse(NumberUtil.evenOddNumber(-7));
        Assert.assertFalse(NumberUtil.evenOddNumber(-99));
    }
}
public class NumberUtilTest {

    @Test
    public void testNumberInInterval() {
        Assert.assertTrue(NumberUtil.numberInInterval(50));
        Assert.assertTrue(NumberUtil.numberInInterval(75));
        Assert.assertFalse(NumberUtil.numberInInterval(20));
        Assert.assertFalse(NumberUtil.numberInInterval(100));
        Assert.assertFalse(NumberUtil.numberInInterval(0));
    }
}

