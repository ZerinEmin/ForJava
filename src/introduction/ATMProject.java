package introduction;

import java.util.Scanner;

public class ATMProject {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int amount = 1000, input, depositmoney, withdrawmoney;
		while(true) {
		System.out.println("Username:");
		String username = scan.next();
		System.out.println("Password: ");
		String password = scan.next();
		if (username.equals("Zerin") && password.equals("1234")) {
			System.out.println("You are logged in");
			System.out.println("Welcome!");
			

		while (amount>0) {
			System.out.println();
			System.out.println("1-Deposit money");
			System.out.println("2-Withdraw money");
			System.out.println("3-Query balance");
			System.out.println("4-Logout");
			System.out.println("Please choose an action");
			input = scan.nextInt();
			
			if (input==1) {
				System.out.println("Please enter the amount you want to deposit");
				depositmoney = scan.nextInt();
				amount = amount+ depositmoney;
				System.out.println("New balance is " + amount);
			}else if(input==2) {
				System.out.println("Please enter the amount you want to withdraw");
				withdrawmoney = scan.nextInt();
				if (withdrawmoney>amount) {
					System.out.println("Insufficient funds!");
				}else {
					amount = amount - withdrawmoney;
					System.out.println("New balance is " + amount);
				}
				
			}else if (input==3) {
				System.out.println("Your current balance is" + amount);
			}else if (input ==4){
				System.out.println("You are logged out");
			}else {
				System.out.println("Unknown action");
			}
		} 
		System.out.println("See you soon!");
	}
		else {
			System.out.println("Invalid username or password!");
		}break;
	}
	
}
}

