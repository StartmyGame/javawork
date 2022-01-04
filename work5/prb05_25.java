package work5;

public class prb05_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k = 10000; k <= 100000; k += 10000) { 
			double ans = 0; double temp = 1.0; 
			for (int i = 1; i <= k; i++) { 
				ans += temp / (2 * i - 1); temp *= -1.0; 
			}
			System.out.println(ans * 4); 
		}
	}

}
