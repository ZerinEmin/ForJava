package introduction;

public class Loops {

	public static void main(String[] args) {
		
		System.out.println("loop started");
		
		/*while(i <=5) {
			System.out.print(i + ","); i++;}
		*/
		
		
		
		/*do {
			System.out.println(i + ",");
			i++;
		}while (i <=5);
		System.out.println("loop ended"); */
		
		
		/*int k =1;
		while(k<=5) {
			System.out.println(k);
			k++;
		}*/
		
		for (int i=1; i <=5; i++) {
			for(int k=1; k<5; k++) {
				System.out.println("i=" + i + " k=" + k);
			}
		}

	}

}
