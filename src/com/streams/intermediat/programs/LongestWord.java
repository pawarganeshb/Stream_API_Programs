package com.streams.intermediat.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestWord {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Berry", "Pine Apple", "Papaya", "Coconut",
				"Cherry");
		Optional<String> max = fruits.stream().max(Comparator.comparing(String::length));
		if (max != null)
			System.out.println(max);
		else
			throw new RuntimeException("Not Fouund Logest Word.");

	}
}
//9. Find the longest word in the list.