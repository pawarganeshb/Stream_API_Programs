package com.streams.basic.programs;

import java.util.Arrays;
import java.util.List;

public class GetStringGreaterThanSpecifSize {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ramesh","Ram","So","Kunal","A","Ganesh");
		names.stream().filter(e->e.length()>5).sorted().forEach(System.out::println);
	}

}
//2. Get the list of strings where the length of each element is greater than 5 and get the count