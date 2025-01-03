package com.strream.basic.programs;

import java.util.Arrays;
import java.util.List;

public class GetSizeOfEachElement {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Berry", "Pine Apple", "Papaya", "Coconut",
				"Cherry");
		fruits.stream().map(str->str.length()).sorted().forEach(System.out::println);
	}

}
//7. Get the length of each name in a list