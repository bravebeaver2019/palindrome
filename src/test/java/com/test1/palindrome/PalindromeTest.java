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

    // Max size we can test without JVM heap size tuning
    @Test
    public void testMaxSizePalindrome() {
        // create a huge string alternating A and B characters
        char ar1[] = new char[Integer.MAX_VALUE/8];
        for(int i=0; i<ar1.length; i++) {
            ar1[i] = (char) ((i%2)+65);
        }        
        assertTrue("is an HUGE VALID palindrome", new Palindrome().isPalindrome(new String(ar1)));
    }
}
