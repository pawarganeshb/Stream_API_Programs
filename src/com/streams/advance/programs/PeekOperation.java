package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PeekOperation {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ganesh", "Pawar", "Patil", "Java", "Developer");
		Stream<String> upperCase = names.stream().peek(e -> System.out.println("Original String:" + e))
				.map(str -> str.toUpperCase());
		upperCase.forEach(System.out::println);
	}

}
