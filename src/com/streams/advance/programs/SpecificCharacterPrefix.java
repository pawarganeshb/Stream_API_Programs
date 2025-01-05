package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SpecificCharacterPrefix {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(73, 97, 81, 200, 79, 75, 71, 88, 50);
		Stream<Integer> map = num.stream().map(String::valueOf).filter(e -> e.startsWith("7")).map(Integer::valueOf);
		map.forEach(System.out::print);
	}

}
