package introduction;

import java.util.Scanner;

public class FlightTicketCalculator {

	public static void main(String[] args) {
		int km, age, type, price;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter km: ");
		km = input.nextInt();
		System.out.println("Please enter age: ");
		age = input.nextInt();
		System.out.println("Please enter type of trip (1=One way , 2=Both ways) : ");
		type = input.nextInt();
		
		double normalPrice, agediscount, typediscount;
		
		if(km > 0 && age >0 && (type==1 || type==2)) {
			normalPrice = km * 0.10;
			if (age<12) {
				agediscount = normalPrice *0.5;
			} else if (age >= 12 && age<=25) {
				agediscount = normalPrice * 0.10;
			}
			else if (age>=65){
				agediscount = normalPrice* 0.30;
				
			} else {
				agediscount= 0;
			}
			normalPrice = normalPrice - agediscount;
			
			
			if (type == 2) {
				typediscount = normalPrice * 0.20;
				normalPrice = (normalPrice - typediscount)*2;
			} 
			System.out.println("Ticket price is: " + normalPrice + "$");
			
		}else {
			System.out.println("Inputs are not correct");
		}

	}
	
	
	

}
