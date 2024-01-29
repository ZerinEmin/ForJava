package introduction;

import java.util.Scanner;

public class ActivityRecommander {

	public static void main(String[] args) {
		int temperature;
		String recommendedActivity = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the temperature:" );
		temperature = input.nextInt();
		
		if (temperature >=30) {
			 recommendedActivity = "Swimming";
		}else if (temperature>=5 && temperature <=30) {
			 recommendedActivity = "Cinema";
		}else if (temperature <=4) {
			 recommendedActivity = "Ski";
		}
		
		System.out.println("Recommended activity is: " + recommendedActivity);

	}

}
