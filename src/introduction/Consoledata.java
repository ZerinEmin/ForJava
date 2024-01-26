package introduction;


import java.util.Scanner;
public class Consoledata {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		/*System.out.println("please enter  value a:");
		a = input.nextInt();
		System.out.println("please enter  value b:");
		b = input.nextInt();
		
		System.out.println("value a:" + a);
		System.out.println("value b:" + b);
		System.out.println(a + b); */
		
		/*double c;
		System.out.println("please enter value c:"); //25,2 degil 25.2 noktayla girmen lazim
		c = input.nextDouble();
		System.out.println(c); */
		
		String str;
		str = input.nextLine(); //komple satiri ciktida verir
		//str = input.next(); burda selamlar nasilsin yazarsan sadece selamlar kismini ciktida verir, yani ilk bosluga kadar aliyor line gibi degil
		System.out.println(str);

	}

}
