package introduction;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		int temp, firstdigit, seconddigit, thirddigit, sum;
		for (int i=100; i<999; i++) {
			temp = i;
			
			firstdigit= temp%10;
			temp /= 10;
			
			seconddigit= temp%10;
			temp/=10;
			
			thirddigit= temp%10;
			temp/= 10;
			
			sum = (firstdigit * firstdigit * firstdigit) + (seconddigit*seconddigit*seconddigit)+ (thirddigit*thirddigit*thirddigit);
			if(sum == i) {
				System.out.println(i + " is an Armstrong number");
			}
			
		}

	}

}
