package com.streams.advance.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {
/*
 * Store All Duplicate Element in to set
 */
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 3, 10, 1, 3, 10, 45, 65, 74);
		Set<Integer> collect = num.stream()
				.filter(e -> Collections.frequency(num, e) > 1)
				.collect(Collectors.toSet());
		System.out.println(collect);
	}

}
