package introduction;

import java.util.Scanner;

public class VATCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double productprice,taxedprice;
		double vat = 0.18;
		
		System.out.println("Please enter product price:");
		productprice = input.nextDouble();
		
		taxedprice = productprice + (productprice*vat);
		System.out.println("New price is:" + taxedprice);
		
	
		
		
		

	}

}
