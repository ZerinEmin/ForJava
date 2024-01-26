package introduction;

public class Operators {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int sum = a + b;
		int sub = a - b;
		int div = a / b;
		int mult = a * b;
		int mod = a % b;
		System.out.println("toplam:" + sum);
		System.out.println("mod:" + mod);
		
		int num1 = 8;
		int num2 = 3;
		boolean cond = (num1 == num2);
		System.out.println(cond);
		
		num1 = num2;
		System.out.println(num1); //ikisi ayni sey ama alttaki yazim daha temiz
		num1 +=2;
		System.out.println(num1); //bu yazim sekli daha temiz
				
	
		

}
}