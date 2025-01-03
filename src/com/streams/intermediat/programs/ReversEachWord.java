package com.streams.intermediat.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReversEachWord {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Berry", "Pine Apple", "Papaya", "Coconut",
				"Cherry");

		Stream<StringBuilder> map = fruits.stream().map(str -> new StringBuilder(str).reverse());
		map.forEach(System.out::println);
	}

}
//12. Write a Java program to create a new list of strings, where each string is reversed from the original list, using Java streams.
