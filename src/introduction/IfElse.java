package introduction;

public class IfElse {
	public static void main(String[] args) {
		int a = 14;
		int b= 13;
		int c = 20;
		
		/*if (a==b) {
			System.out.println("A equals to B");
		} 
		 else if(a>c){
			System.out.println("A is bigger than C");
		}
		 else {
				System.out.println("A is not equal to B");
	}*/
		
		if ((a<c) && (a<b)) {
			System.out.println("A is smallest number");
		} else if ((c<a)&& (c<b)) {
			System.out.println("C is smallest number");
		} else {
			System.out.println("B is smallest number");
		}

}}
