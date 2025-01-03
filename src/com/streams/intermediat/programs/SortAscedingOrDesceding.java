package com.streams.intermediat.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAscedingOrDesceding {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Berry", "Pine Apple", "Papaya", "Coconut",
				"Cherry");

		System.out.println("Ascding Order:: ");
		fruits.stream().sorted().forEach(System.out::println);

		System.out.println("Descding Order:: ");
//		fruits.stream().sorted((str1, str2) -> str2.compareTo(str1)).forEach(System.out::println);
		fruits.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);;
	}

}
//8. Sort the list of strings based on their lengths in ascending/descending order.
