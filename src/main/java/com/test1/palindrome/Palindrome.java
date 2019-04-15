package com.test1.palindrome;

import org.springframework.stereotype.Component;

@Component
public class Palindrome {

    public boolean isPalindrome(String input) {
        int length = input.length();
        for(int i=0; i<length / 2; i++) { // improvement 1: only up to the half, note int division, should work for even and odd length strings
            if(input.charAt(i) != input.charAt(length-1-i))
                return false;
        }
        return true;
    }
}
