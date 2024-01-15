package introduction;

import java.util.Scanner;

public class PerimeterVolumeofCircleCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double r;
		double pi = 3.14;
		double volume;
		double perimeter;
		
		System.out.println("Please enter radius of the circle");
		r = input.nextDouble();
		
		perimeter = 2*pi*r;
		volume = (4/3)*pi*Math.pow(r, 3);
		System.out.println("Perimeter is:" + perimeter);
		System.out.println("Volume is:" + volume);

	}

}
