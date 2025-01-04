package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GetStringElementOfLength10 {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Banguluru","Mumbai","Nagapur","NaviMumbai","New Nanded","Cidco");
		Optional<String> first = cities.stream().filter(str->str.length()==10).findFirst();
		
	     if(first.isPresent())
	    	 System.out.println(first.get());
	     else
	    	 throw new RuntimeException("Not Found");
	}

}
//19. Given a list of strings find the first element having the length as 10 if not handle exceptions
