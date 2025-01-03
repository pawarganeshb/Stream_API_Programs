package com.strream.intermediat.programs;

import java.util.Arrays;
import java.util.List;

public class SortAscedingOrDesceding {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Berry", "Pine Apple", "Papaya", "Coconut",
				"Cherry");
		
		System.out.println("Ascding Order:: ");
		fruits.stream().sorted().forEach(System.out::println);
		
		
		System.out.println("Descding Order:: ");
		fruits.stream().sorted((str1, str2) -> str2.compareTo(str1)).forEach(System.out::println);
	}

}
