package com.streams.basic.programs;

import java.util.Arrays;
import java.util.List;
public class ConvertStringInUpperCase {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("spring basic", "mvc", "jdbc", "react.js", "java", "oracle");
		list.stream().map(e -> e.toUpperCase()).sorted().forEach(System.out::println);
	}

}
//1] Convert a list of strings to uppercase , sort them and print
