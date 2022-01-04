package work5;

public class prb05_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k = 10000; k <= 100000; k += 10000) { 
			double ans = 1.0; double temp = 1; 
			for (int i = 1; i <= k; i++) { 
				temp *= i; ans += (1.0 / temp);
			}
			System.out.println(ans); 
		}
	}

}
