package com.streams.intermediat.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringListInString {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Berry", "Pine Apple", "Papaya", "Coconut",
				"Cherry");
		String collect = fruits.stream().collect(Collectors.joining(", "));
		System.out.println(collect);
	}

}
//11. convert a list of strings into a single string, separated by commas, using streams
