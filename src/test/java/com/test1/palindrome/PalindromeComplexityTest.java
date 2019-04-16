package com.test1.palindrome;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeComplexityTest {

    @Test
    public void testExecutionTimes() {
        long t0 = System.currentTimeMillis();
        checkPalindrome(Integer.MAX_VALUE/4000);
        System.err.println(System.currentTimeMillis()-t0);
    }

    public void checkPalindrome(int size) {
        char ar1[] = new char[size];
        for(int i=0; i<ar1.length; i++) {
            ar1[i] = (char) ((i%2)+65);
        }        
        new Palindrome().isPalindrome(new String(ar1));
    }
}
