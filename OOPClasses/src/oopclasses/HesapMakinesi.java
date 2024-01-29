package oopclasses;

public class HesapMakinesi {
	public int num1;
	public int num2;
	public String color;
	
	
	HesapMakinesi(int num1, int num2, String color){
		this.num1 = num1;
		this.num2 = num2;
		this.color = color;
		
		
	}
	
	public int sum() {
		return this.num1 + this.num2;
	}
	
	public int subt() {
		return this.num1 - this.num2;
	}
	
	public int div() {
		return this.num1 / this.num2;
	}
	
	

}
