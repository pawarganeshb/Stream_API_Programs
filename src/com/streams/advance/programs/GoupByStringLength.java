package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GoupByStringLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("ABC", "ABCD", "PQE", "PQR", "WXYZ", "MNO", "PQRST");
		Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
	}

}
//18. Given a list of strings print only the string elements excluding the digits using streams.
