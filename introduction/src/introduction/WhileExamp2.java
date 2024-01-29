package introduction;

import java.util.Scanner;

public class WhileExamp2 {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int f = scan.nextInt();
		int result = 1;
		
		while (f>0) {
			result *=f;
			f--;
		}
		System.out.println(result);
		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		double h = scan.nextDouble();
		double harmonic = 0.0;
		while(h>0) {
			harmonic += (1/h);
			h--;
		}
		System.out.println(harmonic);
		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		int i = 1;
		while (i<= star) {
			int k = 1;
			while (k<=i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		} */
		
		int num1, num2, result=1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Ussu alinacak sayi: ");
		num1 = scan.nextInt();
		System.out.print("Us olacak sayi: ");
		num2 = scan.nextInt();
		int i =1;
		while(i<=num2) {
			result= result * num1;
			i++;
		} System.out.println("Sonuc: " + result);
	}

}
