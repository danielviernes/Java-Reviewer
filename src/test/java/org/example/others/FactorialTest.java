package org.example.others;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorial_success() {
        int testData = 5;
        int expected = 120;

        int actual = Factorial.calculate(testData);
        System.out.printf("Result: %d", actual);


        Assert.assertEquals(expected, actual);
    }

}
