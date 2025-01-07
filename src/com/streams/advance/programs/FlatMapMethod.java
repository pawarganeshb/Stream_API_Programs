package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethod {

	public static void main(String[] args) {
		List<List<String>> fruits = Arrays.asList(Arrays.asList("Apple", "Pine Apple"),
				Arrays.asList("Mango", "Banana"), Arrays.asList("Coconut", "Graps"));

		System.err.println("Before Flatting Stram");
		fruits.stream().forEach(System.out::println);

		System.err.println("After Flatting Stram");
		List<String> collect = fruits.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(collect);

	}

}
