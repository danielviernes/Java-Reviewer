package org.example.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {

    @Test
    public void testBubbleSort_success() {
        List<Integer> testData = Arrays.asList(6, 3, 0, 8, 6, 1, 5, 4, 2, 2);

        List<Integer> result = BubbleSort.sort(testData);

        System.out.println(result);

        Assert.assertTrue(assertSorting(result));
    }

    private boolean assertSorting(List<Integer> result) {
        for(int i = 0; i < result.size()-1; i++) {
            if(result.get(i) > result.get(i+1))
                return false;
        }
        return true;
    }

}
