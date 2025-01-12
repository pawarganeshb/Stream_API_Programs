package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;

public class ReduceSumMethod {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10, 20, 30, 40, 50);
		Integer sum = num.stream().reduce(0, Integer::sum);
		System.out.println("Sum is: " + sum);
		num.stream().sorted((n1, n2) -> -n1.compareTo(n2)).forEach(System.out::println);
	}

}
