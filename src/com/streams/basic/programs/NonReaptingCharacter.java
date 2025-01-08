package com.streams.basic.programs;

import java.util.Arrays;
import java.util.Scanner;

public class NonReaptingCharacter {
	public static void main(String[] args) {
		String str = "Java is technology";

		int[] freq = new int[256];
		for (char ch : str.toCharArray())
			freq[ch]++;
		for (char ch : str.toCharArray()) {
			if (freq[ch] == 1) {
				System.out.println(ch);
			  }
		  
		  }
		 

//		String[] wordArray = str.split(" ");
//		int wordLength = 0;
//		String longestWord = "";
//		for (String word : wordArray) {
//			if (word.length() > wordLength) {
//				wordLength = word.length();
//				longestWord = word;
//			}
//		}
//		System.out.println(longestWord);

		/*
		 * int[] arr = { 1, 2, 3, 4, 5, 6 }; System.out.println(Arrays.toString(arr));
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the number: "); int num = sc.nextInt(); boolean
		 * flag = false; for (int i = 0; i < arr.length; i++) { for (int j = i + 1; j <
		 * arr.length; j++) { if (num == (arr[i] + arr[j])) { System.out.println(arr[i]
		 * + " & " + arr[j]); } else { flag = true; }
		 * 
		 * } } if (flag) { System.out.println("Not found sum of pair"); }
		 */ // sc.close();
		
	}

}
