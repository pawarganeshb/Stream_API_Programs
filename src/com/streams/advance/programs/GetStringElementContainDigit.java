package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;

public class GetStringElementContainDigit {

    public static void main(String[] args) {
        List<String> states = Arrays.asList("MH26", "RJ", "UK", "MP19");

        // Print only the strings that do not contain any digits
        states.stream()
              .filter(str -> !str.matches(".*\\d.*"))  // Check if the string does not contain digits
              .forEach(System.out::println);  // Print the strings that do not contain digits
    }
}
//18. Given a list of strings print only the string elements excluding the digits using streams.
