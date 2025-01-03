package com.streams.basic.programs;

import java.util.Arrays;
import java.util.List;

public class FindSpecifWord {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ram","Ganesh","Shiv","Vishnu","Mahesh","Bramha");
		names.stream().filter(s->s.contains("a")).forEach(System.out::println);;
	}
}
//4. Get the list of strings having a particular word 