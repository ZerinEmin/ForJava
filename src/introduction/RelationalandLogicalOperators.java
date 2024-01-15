package introduction;

public class RelationalandLogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		int c = 50;
		int d = 20;
		
		boolean result = a==b;
		System.out.println(result); //false cikacak ikisi esit degil
		System.out.println(a!=b);//esit degil diyor, true cikacak cunku esit degil
		System.out.println(a>=b);
		
		//Logical
		boolean condition1 = a<b;
		boolean condition2 = d>c;
		
		boolean result1 = !(condition1 && condition2); //onune unlem koyarsan degil'i demek olur ve sonucu tersine cevirir
		System.out.println(result1);
	

	}

}
