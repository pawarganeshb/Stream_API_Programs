package com.streams.basic.programs;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class GetAverage {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(73, 97, 81, 200, 8);
		OptionalDouble average = num.stream().mapToInt(Integer::intValue).average();
		if (average != null)
			System.out.println(average.getAsDouble());
		else
			throw new RuntimeException("Unable to calculate average");
	}

}
