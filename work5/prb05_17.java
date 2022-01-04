package work5;
import java.util.Scanner;
public class prb05_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter the number of line: "); 
		int n = input.nextInt(); 
		for (int i = 0; i < n; i++) { 
			for (int j = 1; j <= 2 * n - 1; j++) { 
				if (j >= n - i && j <= n + i) { 
					if (j < n) { 
						System.out.print(n - j + 1 + " "); 
					} 
					else { 
						System.out.print(j - n + 1 + " "); 
					} 
				}
				else{
					System.out.print(" ");
				} 
			}
			System.out.println(""); 
		}
	}

}
