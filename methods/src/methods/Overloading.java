package methods;

public class Overloading {
	
	static int add(int a, int b) {
		return a+b;
		
	}
	static int add(int a, int b, int c) { //normalde ayni isimle iki method yazilmaz, java nasil ayirt ediyor add keyword ile 
		return a+b+c;
	}
	static double add(int a, int b, double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		System.out.println(add(1,2));
		System.out.println(add(1,2,8));
		System.out.println(add(1,2,8.90));

	}

}
