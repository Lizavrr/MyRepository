import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return  a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor can't be zero");
        }
        return a / b;
    }

    @Test
    public void testAdd() {
        assertEquals(13, add(6, 7), 0.0001);
    }

    @Test
    public void testAdd2() {
        assertEquals(12, add(6, 7), 0.0001 );
    }

    @Test
    public void testMinus() {
        assertEquals(5, minus(10, 5), 0.0001);
    }

    @Test
    public void testMinus2() {
        assertEquals(2, minus(10, 5), 0.0001);
    }

    @Test
    public void testMultiply() {
        assertEquals(30, multiply(6, 5), 0.0001);
    }

    @Test
    public void testMultiply2() {
        assertEquals(3, multiply(5, 2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideo() {
        assertEquals(2, divide(10,0), 0.0001);
    }

    @Test
    public void testDivide2() {
        assertEquals(3, divide(28, 7), 0.0001);
    }


}
