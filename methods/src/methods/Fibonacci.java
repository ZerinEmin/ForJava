package methods;

public class Fibonacci {
	
	static int fibo (int n) {
		if (n==1 || n==2)
			return 1;
		
		return fibo(n-1) + fibo(n-2);
	}

	public static void main(String[] args) {
		// f(6)=f(4)+ f(5)
		System.out.println(fibo(7));

	}

}
