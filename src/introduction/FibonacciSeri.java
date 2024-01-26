package introduction;

import java.util.Scanner;

public class FibonacciSeri {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int input = scan.nextInt();
		int n1=0;
		int n2=1;
		int sum;
		
		System.out.print(input + " Fibonacci serii is");
		
		for (int i =1; i<= input; i++) {
			System.out.print(n1 + " , ");
			
			sum= n1+n2;
			n1 =n2;
			n2= sum;
		}
		

	}

}
