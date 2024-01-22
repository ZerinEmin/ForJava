package methods;

public class ReturnandVoidusage {
	
	static int power(int a, int b) { //void yerine int yazdin cunku void bir deger return yapamaz
		int result = 1;
		for(int i =1; i<=b; i++) {
			result *= a;
		}
		return(result);
	}

	public static void main(String[] args) {
		
		int r = power(2,3);
		System.out.println(r);
	}

}
