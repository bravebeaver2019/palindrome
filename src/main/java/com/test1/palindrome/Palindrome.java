package com.test1.palindrome;

import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class Palindrome {

    public boolean isPalindrome(String input) {
        return IntStream.range(0, input.length() / 2)
                .allMatch(i -> input.charAt(i) == input.charAt(input.length() - i - 1));
    }
}
