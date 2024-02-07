package exerciseprojects;

import java.util.Scanner;

public class ReverseString {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		String originalString = "";
		System.out.println("Please enter a word: " + originalString);
		originalString = scan.next();
		
		StringBuilder sb = new StringBuilder(originalString);
		sb.reverse();
		String reversedString = sb.toString();
		System.out.println(reversedString);
		
	}
	
	

}
