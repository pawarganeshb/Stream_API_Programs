package com.streams.basic.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Berry", "Pine Apple", "Papaya", "Coconut",
				"Cherry");
		Optional<String> first = fruits.stream().filter(str -> str.startsWith("B")).findFirst();
		if (first == null) {
			System.out.println("Unable To Find Element");
		} else {
			System.out.println(first.get());
		}
	}

}
//6. Find the first element in a list that starts with a particular letter