package work5;

public class prb05_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Count = 0; int ans = 0; 
		for (int i = 101; i <= 2100; i++) { 
			if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) { 
				Count++; 
				ans++; 
				System.out.printf("%4d ", i); 
				if (Count == 10) { 
					System.out.println(""); 
					Count = 0; 
				} 
			} 
		}
		System.out.println("\nThe number of leap year: " + ans);
	}

}
