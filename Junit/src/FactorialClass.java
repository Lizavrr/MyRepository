import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FactorialClass {

    public long factorialCalculation(int a) {
        long res = 1;
        for (int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }

    @Test(timeout = 1000)
    public void test() {
        assertEquals(720, factorialCalculation(6));
    }

    @Test(timeout = 1000)
    public void test2() {
        assertEquals(5040, factorialCalculation(7));
    }

}