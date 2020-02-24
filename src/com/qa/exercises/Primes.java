package com.qa.exercises;

public class Primes {

	String numberOfPrimeNumbers(int maxNumber) {
		String primes = "";
		if (maxNumber >= 2) {
			primes += "2,";
		}
		for(int i = 3; i <= maxNumber; i +=2) {
			boolean isPrime = true;
			for (int j = 3; j <= Math.sqrt(i); j +=2) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes = primes += i + ",";
			}
		}
		return primes;
	}
}
