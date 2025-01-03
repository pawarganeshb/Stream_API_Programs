package com.streams.basic.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "Michael", "Sara", "John", "Michael", "Chris", "Anna",
				"Matthew", "Chris");
		Stream<String> distinct = names.stream().distinct();
		distinct.forEach(e -> System.out.println(e));
	}

}
//3. Remove duplicates from a list