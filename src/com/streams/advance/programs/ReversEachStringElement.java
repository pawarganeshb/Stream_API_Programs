package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;

public class ReversEachStringElement {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Pune", "Mumbai", "Haydrabad", "Nashik", "Nagapur");
		list.stream().map(str -> new StringBuilder(str).reverse()).forEach(System.out::println);
		
	}

}
//20. Reverse the list of strings using streams api
