package com.streams.advance.programs;

import java.util.Scanner;

public class FiboSeriesAndStarCombination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbeer: ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int result = fibo(i);
			System.out.print(result);
			for (int j = 0; j < result; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

	private static int fibo(int num) {
		if (num <= 1) {
			return num;
		}
		return fibo(num - 1) + fibo(num - 2);

	}

}
