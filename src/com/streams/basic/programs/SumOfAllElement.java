package com.streams.basic.programs;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElement {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10, 20, 30, 40, 50);
		int sum = num.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}
