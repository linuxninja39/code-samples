package net.s56.net.s56.commandModules;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jacob on 9/2/15.
 */
public class FactorialTest {

    @Test
    public void testGetFactorial() {
        Integer number = 10;
        Integer control = 3628800;
        Factorial factorial = new Factorial(number);
        Integer factorialNumber = factorial.getFactorial();
        assertEquals(control, factorialNumber);

        number = 6;
        control = 720;
        factorial = new Factorial(number);
        factorialNumber = factorial.getFactorial();
        assertEquals(control, factorialNumber);

        number = 12;
        control = 479001600;
        factorial = new Factorial(number);
        factorialNumber = factorial.getFactorial();
        assertEquals(control, factorialNumber);
    }
}
