package org.example.others;

import org.junit.Assert;
import org.junit.Test;

public class StringsTest {

    @Test
    public void testIsSubstring_success() {
        String testData = "test123";

        Assert.assertTrue(Strings.isSubstring(testData, "123"));
    }

    @Test
    public void testIsSubstring_nullSample_returnFalse() {
        String testData = "test123";

        Assert.assertFalse(Strings.isSubstring(testData, null));
    }

    @Test
    public void testIsSubstring_longerSample_returnFalse() {
        String testData = "test123";

        Assert.assertFalse(Strings.isSubstring(testData, "test1234"));
    }

    @Test
    public void testIsPalindrome_success() {
        String testData = "aadaa";

        Assert.assertTrue(Strings.isPalindrome(testData));

    }

    @Test
    public void testIsPalindrome_fail() {
        String testData = "aadaaa";

        Assert.assertFalse(Strings.isPalindrome(testData));

    }

    @Test
    public void testIsPalindrome_inputNull_fail() {
        String testData = null;

        Assert.assertFalse(Strings.isPalindrome(testData));

    }

    @Test
    public void testIsPalindrome_inputBlank_success() {
        String testData = "   ";

        Assert.assertTrue(Strings.isPalindrome(testData));

    }

}
