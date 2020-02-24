package com.qa.exercises;
import java.util.LinkedHashSet;
import java.util.Set;

public class Unique {
	public String uniqueLetters(String sentence) {
		Set<Character> uniqueLetterList = new LinkedHashSet<Character>();
		String uniqueLetters = "";
		for (int i = 0; i < sentence.length(); i++) {
			uniqueLetterList.add(sentence.charAt(i));
		}
		for (char c : uniqueLetterList) {
			uniqueLetters += c;
		}
		return uniqueLetters;
	}

}
