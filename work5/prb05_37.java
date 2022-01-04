package work5;
import java.util.Scanner;
public class prb05_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter the decimal numeral: "); 
		int num = input.nextInt(); 
		int[] digits = new int[65]; 
		int tot = 0; 
		while (num > 0) { 
			digits[++tot] = num % 2; 
			num /= 2; 
		}
		for (int i = tot; i >= 1; i--) { 
			System.out.print(digits[i]); 
		}
	}

}
