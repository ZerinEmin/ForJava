package introduction;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number:");
		
		int number = scan.nextInt();
		switch(number) {
		case 1:
			System.out.println("Number is equal to 1");
			break;
		case 2:
			System.out.println("Number is equal to 2");
			break;
		case 3:
			System.out.println("Number is equal to 3");
			break;
		}

	}

}
