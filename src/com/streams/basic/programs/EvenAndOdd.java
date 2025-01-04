package com.streams.basic.programs;

import java.util.Arrays;
import java.util.List;

public class EvenAndOdd {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(73, 97, 81, 200, 8);
		System.out.println("Even Element:");
		num.stream().filter(n -> n % 2 == 0).sorted().forEach(System.out::println);
		System.out.println("Odd Element:");
		num.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
	}

}
