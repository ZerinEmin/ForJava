package introduction;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String username="Zerin", password="1234";
		System.out.println("Please enter username: ");
		username = scan.nextLine();
		System.out.println("Please enter password: ");
		password = scan.nextLine();
		
		
		if (username.equals("Zerin") && password.equals("1234")) {
			System.out.println("Login is succesful");
		}else {
			System.out.println("Username or password is invalid");
		}

	}

}
