package by.bsu.triangle;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TriangleCheckerTest {
    private double[] sidesForTrueTriangle(){
        return new double[] {3, 4, 5};
    }

    private double[] sidesForTrueTriangleChangePosition(){
        return new double[] {4, 5, 3};
    }

    private double[] sidesForTrueTriangleChangeAgain(){
        return new double[] {5, 4, 3};
    }

    private double[] sidesForFalseTriangle(){
        return new double[] {1, 1, 2};
    }

    private double[] sidesZero(){
        return new double[] {0, 0, 0};
    }

    private double[] sidesNegative(){
        return new double[] {-3, -4, -5};
    }

    private double[] sidesNegativePositive(){
        return new double[] {-1, 2, 3};
    }

    private double[] sidesOneZero(){
        return new double[] {3, 0, 5};
    }

    private double[] sidesTwoZero(){
        return new double[] {3, 0, 0};
    }

    private double[] sidesTwoNegativeSides(){
        return new double[] {3, -4, -5};
    }

    @Test
    public void checkTrueTest(){
        Assert.assertTrue(TriangleChecker.check(sidesForTrueTriangle()));
    }

    @Test
    public void checkFalseTest(){
        Assert.assertFalse(TriangleChecker.check(sidesForFalseTriangle()));
    }

    @Ignore("Teeest")
    @Test
    public void shouldFailTest(){
        Assert.assertTrue(true);
    }

    @Test
    public void checkZeroTest(){
        Assert.assertFalse(TriangleChecker.check(sidesZero()));
    }

    @Test
    public void checkNegativeSides(){
        Assert.assertFalse(TriangleChecker.check(sidesNegative()));
    }

    @Test
    public void checkOneNegativeSide(){
        Assert.assertFalse(TriangleChecker.check(sidesNegativePositive()));
    }

    @Test
    public void checkOneSideZero(){
        Assert.assertFalse(TriangleChecker.check(sidesOneZero()));
    }

    @Test
    public void checkTwoSidesZero(){
        Assert.assertFalse(TriangleChecker.check(sidesTwoZero()));
    }

    @Test
    public void checkTwoSidesNegative(){
        Assert.assertFalse(TriangleChecker.check(sidesTwoNegativeSides()));
    }

    @Test
    public void checkTrueTriangleChangePosition(){
        Assert.assertTrue(TriangleChecker.check(sidesForTrueTriangleChangePosition()));
    }

    @Test
    public void checkTrueTriangleAgainChangePosition(){
        Assert.assertTrue(TriangleChecker.check(sidesForTrueTriangleChangeAgain()));
    }
}
