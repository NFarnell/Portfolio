package com.qa.exercises;

//Q1.find public boolean find(String s,int i,charc)
//find ("hello",2,"e") --->true 
//find("Trash",4,"a" ---->false
// find ("Trash",4,"5" ---->true
public class Find {

	public boolean findTheChar(String s, int i, char c) {
		char substring = s.charAt(i);
		return (substring == c);

	}

}
