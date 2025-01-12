package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;

public class MaxNumberFromList {

	public static void main(String[] args) {
		List<Integer> n = Arrays.asList(73, 97, 81, 200, 8);
		Integer max = n.stream().max(Integer::compare).get();
		System.out.println("Largest Numbere: " + max);
		// bonus
		Integer min = n.stream().min(Integer::compare).get();
		System.out.println("Smalllest Number: " + min);
	}

}
