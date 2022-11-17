import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    Calculator casio;

    @Test(testName = "Testing sum method from Calculator")
    public void testSum() {
        casio = new Calculator();
        Assert.assertEquals(casio.sum(20, 30), 50);
    }

    @Test(testName = "Testing subtract method from Calculator")
    public void testSubtract() {
        casio = new Calculator();
        Assert.assertEquals(casio.subtract(10, 4), 6);
    }

    @Test(testName = "Testing multiply method from Calculator")
    public void testMultiply() {
        casio = new Calculator();
        Assert.assertEquals(casio.multiply(7, 9), 63);
    }

    @Test(testName = "Testing divide method from Calculator")
    public void testDivide() {
        casio = new Calculator();
        Assert.assertEquals(casio.divide(40, 4), 10);
    }
}
