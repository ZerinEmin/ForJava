package introduction;

import java.util.Scanner;

public class BreakandContinue {

	public static void main(String[] args) {
		// break donguyu durdurur
		//contunie donguyu durdurmaz ama bir sonraki adima atlar
		
		Scanner scan = new Scanner(System.in);
		/*int number;
		while (true) {
			System.out.println("Please enter a number");
			number= scan.nextInt();
			if(number == 0) {
				break;
			}
			System.out.println(number); // kullanici sifir girene kadar devam edecek
		}*/
		
		for(int i = 1; i<10; i++) {
			if(i == 4 || i ==9) {
				System.out.println("jumped " + i);
				continue;
			}
			System.out.println("i= " + i);
		}

	}

}
