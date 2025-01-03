package com.streams.basic.programs;

import java.util.Arrays;
import java.util.List;

public class RemoveWord {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Berry", "Pine Apple", "Papaya", "Coconut",
				"Cherry");
		fruits.stream().filter(str -> !str.startsWith("Banana")).forEach(System.out::println);

	}

}
//5. Write a Java program to remove strings that start with a specific word from a list using streams.
