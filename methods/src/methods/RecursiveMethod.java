package methods;

public class RecursiveMethod { //kendini yenileyen demek 

	static int f(int x) {
		int sum = 0;
		for(int i =1; i<=x; i++) {
			sum +=i;
		}
		return sum;
	}
	
	static int r (int x) {
		if(x==1) {
			return 1;
		}
		return x+r(x-1);
	}

}
