package introduction;

import java.util.Scanner;

public class GradeAvarageCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int grade1;
		int grade2;
		int grade3;
		
		
		System.out.println("Please enter visa grade:");
		grade1 = input.nextInt();
		System.out.println("Please enter final grade:");
		grade2 = input.nextInt();
		System.out.println("Please enter quiz grade:");
		grade3 = input.nextInt();
		
		double avarage = ((grade1*0.2) + (grade2*0.35) + (grade3*0.45));
		System.out.println("Your GPR is:" + avarage);
		
		String result = (avarage >=50 ) ? "You passed the class" : "You failed";
		System.out.println(result);

	}

}
