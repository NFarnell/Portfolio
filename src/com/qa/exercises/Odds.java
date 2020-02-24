package com.qa.exercises;

public class Odds {
	public static void main(String args[]) {

		int a[] = { 58, 19, 3, 42 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {

				System.out.println("Odd Number:");
				System.out.println(a[i]);
			}
		}

	}

}
