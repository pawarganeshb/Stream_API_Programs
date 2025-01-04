package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;

public class SquareAndAverageOfElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		// AVERAGE
		double avg = list.stream().map(num -> num * num).filter(e -> e > 100).mapToInt(e -> e).average().getAsDouble();
		System.out.println(avg);

	}

}
