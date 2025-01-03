package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstCharacter {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Jupitar", "Mars", "Mercury", "Venus", "Earth", "Moon", "Sun");
		Map<Character, List<String>> collect = list.stream().collect(Collectors.groupingBy(str -> str.charAt(0)));
		System.out.println(collect);

	}

}
//14. Given a list of strings, group a list of strings by the 
//first letter of each string using streams
