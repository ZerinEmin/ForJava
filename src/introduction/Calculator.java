package introduction;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2, choice;
		
		System.out.print("Please enter first number:");
		number1 = scan.nextInt();
		System.out.print("Please enter second number");
		number2 = scan.nextInt();
		System.out.print("Please choose the function you want to use:");
		System.out.println("\n 1-Sum\n 2-Subtract\n 3-Divison\n 4-Multiple");
		System.out.print("Your choice: ");
		choice = scan.nextInt();
		
		if (choice == 1) {
			System.out.println("Sum = " + (number1+number2));
		}else if (choice ==2) {
			System.out.println("Sub = " + (number1-number2));
			
		}else if (choice == 3) {
			System.out.println("Div = " + (number1/number2));
		}else if (choice == 4){
			System.out.println("Mult = " + (number1*number2));
		}
		else {
			System.out.println("Unknown function please try again");
		}

	}

}
 