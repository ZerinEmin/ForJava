package introduction;

import java.util.Scanner;

public class WhileExamp {

	public static void main(String[] args) {
		/*int i = 1;
		while(i <=100) { //1den 100e cift yazdirma
			
			if(i%2 ==0) {
				System.out.println(i);
			}
			i++;
		}
		
		/*int sum=0;
		int input;
		Scanner scan =  new Scanner(System.in);
		
		
		while (true) { //negatif girilene kadar girilen tek sayilari toplayacak
			System.out.println("Please enter number: ");
			input = scan.nextInt();
			if (input<0) {
				System.out.println("Negative input!");
				System.out.println("Sum of odd numbers: " + sum);
				break;
			}
			if (input%2 ==1) {
				sum += input;
			}
		} */
		
		int input2;
		int k =1;
		Scanner scan =  new Scanner(System.in);
		while(true) {
			System.out.println("Please enter a number: ");
			input2 = scan.nextInt();
			if (k <= input2) {
				System.out.println(k);
				k = k *2;
			}
		}

	} 
	

}
