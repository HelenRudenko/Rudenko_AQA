import calculator.ConsoleCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testCalculatorAdd() {
        int resultAdd = ConsoleCalculator.operation(6, "+", 7);
        Assert.assertEquals(resultAdd, 13);

    }

    @Test
    public void testCalculatorSubtract() {
        int resultSubtract = ConsoleCalculator.operation(17, "-", 10);
        Assert.assertEquals(resultSubtract, 7);
    }

    @Test
    public void testCalculatorDivide() {
        int resultDivide = ConsoleCalculator.operation(10, "/", 2);
        Assert.assertEquals(resultDivide, 5);
    }

    @Test
    public void testCalculatorDuplicate() {
        int resultDuplicate = ConsoleCalculator.operation(10, "*", 2);
        Assert.assertEquals(resultDuplicate, 20);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testException() {
        int resultDivideZero = ConsoleCalculator.operation(5, "/", 0);
    }
}

