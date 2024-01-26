package introduction;

import java.util.Scanner;

public class DoWhileExamp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input, sum = 0;
		do {
			System.out.print("Please enter number: ");
			input = scan.nextInt();
			if(input%2==0) {
				sum += input;
				break;
			}
		}while (input>0);
			System.out.println("Sum of odd numbers " + sum);
		

	}

}
