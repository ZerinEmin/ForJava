package methods;

public class Intro {

	public static void main(String[] args) {
		//f(4);
		//System.out.println("second method");
		//f(6); //ayni methodu ikinci kere kullanabildin
		//f(x) = (x+2)*6;  //2. cagirmak icin de diger methodun da basina static eklemen lazim
		
		power(47,3);

	}
	
	static void f(int x) {
		 int result = (x+2)* 6;
		 System.out.println(result); // 1.direk bunu yazdirirsan calismaz bu methodu cagirman lazim
	 }
	
	static void power (int num1,int num2) {
		int result = 1;
		for(int i=1; i<=num2; i++) {
			result *= num1;
		}
		System.out.println("Result " + result);
	}

}
