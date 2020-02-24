package com.qa.exercises;

public class FizzBuzz {

	public String fizzBuzzPopSnap(int num) {
		String result = "";

		if (num % 3 == 0) {
			result = result + "Fizz";
		}
		if (num % 5 == 0) {
			result = result + "Buzz";
		}
		if (num % 7 == 0) {
			result = result + "Pop";
		}
		if (num % 9 == 0) {
			result = result + "Snap";
		}

		if (num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num % 11 != 0) {
			result = String.valueOf(num);
		}

		return result;

	}
}