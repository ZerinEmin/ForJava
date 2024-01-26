package oopclasses;

public class Classes {

	public static void main(String[]args) {
		
		HesapMakinesi m1 = new HesapMakinesi(11,34, "black");
		System.out.println(m1.sum());
		
		HesapMakinesi m2 =  new HesapMakinesi(25,78, "yellow");
		System.out.println(m2.sum());
	}
}
