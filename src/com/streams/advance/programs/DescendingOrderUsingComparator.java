package com.streams.advance.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrderUsingComparator {

	public static void main(String[] args) {
		String[] str = { "Sachin", "Saurabh", "Samir", "Satish" };
		List<String> list = new ArrayList<String>();
		for (String word : str) {
			list.add(word);
		}
		List<String> sorted = list.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(sorted);
	}

}
