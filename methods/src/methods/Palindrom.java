package methods;

public class Palindrom {
	
	static boolean isPalindrom (int input){
		int tmp, reversednumber=0, rest;
		tmp=input;
		
		while (tmp !=0) {
			rest=tmp%10;
			reversednumber= reversednumber*10 + rest;
			tmp /=10;
		}
		if(input ==reversednumber) 
				return true;
		else
				return false;
		}
		
		

	public static void main(String[] args) {
		//tersi kendisine esit olan ex:121
		System.out.println(isPalindrom(123));
		

	}

}
