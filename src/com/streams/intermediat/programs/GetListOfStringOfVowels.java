package com.streams.intermediat.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GetListOfStringOfVowels {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Berry", "Pine Apple", "Papaya", "Coconut",
				"Cherry","sky");

		Stream<String> filter = fruits.stream().filter(str -> !str.matches(".*[aeiou].*"));
		filter.forEach(System.out::println);
	}

}
//10. Get the list of strings having vowels
