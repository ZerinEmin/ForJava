package introduction;

import java.util.Scanner;

public class SortingNumbers {

	public static void main(String[] args) {
		//a>b>c or a>c>b
		//b>a>c or b>c>a
		//c>a>b or c>a>b
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter numbers: ");
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if (a>b && a>c) {
			if(b>c) {
				System.out.println("a>b>c");}
			else {
				System.out.println("a>c>b");
			}
			
			}else if (b>a && b>c) {
				if (a>c) {
					System.out.println("b>a>c");
				}else {
					System.out.println("b>c>a");
				}
			}else {
				if(a>b) {
					System.out.println("c>a>b");
				}else {
					System.out.println("c>b>a");
				}
			}
		}
	}


