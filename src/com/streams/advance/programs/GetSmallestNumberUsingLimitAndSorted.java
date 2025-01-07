package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;

public class GetSmallestNumberUsingLimitAndSorted {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(73, 97, 81, 200, 8);
		System.err.println("Smallest Number:");
		Integer firstSmallest = num.stream().
				sorted().
				findFirst().get();
		System.out.println(firstSmallest);
		
		System.err.println("Highest Number:");
		num.stream().
		sorted((num1,num2)->Integer.compare(num2, num1))
		.limit(1).
		forEach(System.out::println);
	}

}
