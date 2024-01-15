package introduction;

import java.util.Scanner;

public class PassingClassCalculator {

	public static void main(String[] args) {
		int literaturegrade, mathgrade, pegrade, sciencegrade;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Literature grade: ");
		literaturegrade = input.nextInt();
		System.out.println("Please enter your Math grade: ");
		mathgrade = input.nextInt();
		System.out.println("Please enter your PE grade: ");
		pegrade = input.nextInt();
		System.out.println("Please enter your Science grade: ");
		sciencegrade = input.nextInt();
		
		int avarage = ((literaturegrade)+ (mathgrade) + (pegrade) + (sciencegrade))/ 4;
		System.out.println("Your avarage is: " + avarage);
		
		String result = (avarage >=50 ) ? "You passed the class" : "You failed the class";
		System.out.println(result);

	}

}
