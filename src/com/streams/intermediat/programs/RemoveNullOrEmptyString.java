package com.streams.intermediat.programs;

import java.util.Arrays;
import java.util.List;

public class RemoveNullOrEmptyString {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("null", null, "Banana", "Mango", "Berry", "Pine Apple", "Papaya", "Coconut",
				"");

		fruits.stream().filter(str -> (str != null) && (!str.isEmpty())).forEach(System.out::println);
	}

}
//13. Write a Java program to remove all strings from the list that are empty or null using streams.
