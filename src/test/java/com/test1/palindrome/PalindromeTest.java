package com.test1.palindrome;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeTest {

    @Test
    public void testOddPalindrome() {
        assertTrue("is an ODD palindrome", new Palindrome().isPalindrome("12345654321"));
    }

    @Test
    public void testEvenPalindrome() {
        assertTrue("is an EVEN palindrome", new Palindrome().isPalindrome("1234554321"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse("is NOT a palindrome", new Palindrome().isPalindrome("12345574321"));
    }

    @Test
    public void testEmptyPalindrome() {
        assertTrue("is a valid EMPTY palindrome", new Palindrome().isPalindrome(""));
    }

    // I assume this exception is expected behaviour
    @Test(expected = NullPointerException.class)
    public void testNullCheckPalindrome() {
        new Palindrome().isPalindrome(null);
    }
}
