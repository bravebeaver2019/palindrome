package com.test1.palindrome;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SpringBootApplication
@ComponentScan(basePackages = {"com.test1.palindrome"})
@Slf4j
public class PalindromeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalindromeApplication.class, args);
	}

	@Autowired
    Palindrome palindrome;

	@Bean
    public ApplicationRunner commandLineRunner() {
        return args -> {
            String[] sourceArgs = args.getSourceArgs();
            if(sourceArgs.length<1) {
                log.error("Please specify an argument");
                log.error("Usage: ./palindrome 12321");
            } else {
                String input = sourceArgs[0];
                log.info("is string palindrome? " + palindrome.isPalindrome(input));
            }
        };
    }

}
