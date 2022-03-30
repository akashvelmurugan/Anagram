package com.anagram;

import java.util.Iterator;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String stringOne = scanner.next();
		System.out.println("Enter Second String : ");
		String stringTwo = scanner.next();

		if(stringOne.length()!=stringTwo.length()) {
			System.out.println("Is Not Anagram");
		}else {
			int counter=0;
			char[] charArray = stringOne.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				for (int j = 0; j < stringTwo.length(); j++) {
					if(charArray[i]==stringTwo.charAt(i)) {
					counter++;	
					}
				}
			}
			//if (cout) {
				
			}

		}
	}
}
