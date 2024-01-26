package introduction;

import java.util.Scanner;

public class GcfLcm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, gcf=1, lcm;
		System.out.println("Please enter numbers; ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		
		int min =(n1<n2) ? n1 :n2;
		
		for (int i=min; i>0; i-- ) {
			if((n1%i==0) && (n2%i==0)){
				gcf=i;
				break;
			}
		}
		lcm = (n1*n2)/ gcf;
		System.out.println("GCF is " +gcf );
		System.out.println("LCM is " +lcm );

	}

}
