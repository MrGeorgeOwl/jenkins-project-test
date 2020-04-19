package by.bsu.triangle;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TriangleCheckerTest {

    @Test
    public void checkTrueTest(){
        Assert.assertTrue(TriangleChecker.check(3, 4, 5));
    }

    @Test
    public void checkFalseTest(){
        Assert.assertFalse(TriangleChecker.check(1, 1, 2));
    }

    @Ignore("Teeest")
    @Test
    public void shouldFailTest(){
        Assert.assertTrue(true);
    }
}
