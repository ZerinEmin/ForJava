package introduction;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int input;
		boolean prime = true;
		Scanner scan = new Scanner(System.in);
		
		
		do {
			System.out.println("Please enter a number");
			input = scan.nextInt();
			}while (input <2);
		
		for (int i =2; i<input; i++) {
			if(input%i ==0) {
				prime = false;
				break;
			}
		}
		if(prime) {
			System.out.println("number is " + input + " prime");
		}else {
			System.out.println("number is not prime");
		}
		

	}

}
