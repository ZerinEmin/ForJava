package exerciseprojects;

public class SwapingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4, y =5;
		
		if (x == 0) {
			x=y;
			y=0;
		} else if (y == 0){
			y=x;
			x=0;
		}
		
		else {
			x = x*y;
			y = x/y;
			x = x/y;
		}
		System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);
	}
	

}
