package work7;
import java.util.Scanner;
public class prb07_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.print("ENter 10 numbers: "); 
		double[] num = new double[20]; 
		int n = 10; 
		for (int i = 1; i <= n; i++) { 
			num[i] = input.nextDouble(); 
		}
		num = Sort(num, n); 
		for (int i = 1; i <= n; i++) { 
			System.out.print(num[i] + " "); 
		}
	}
	public static double[] Sort(double[] list, int n) { 
		for (int i = 1; i < n; i++) { 
			for (int j = 1; j < n - i + 1; j++) { 
				if (list[j] > list[j + 1]) { 
					double temp = list[j]; 
					list[j] = list[j + 1]; 
					list[j + 1] = temp; 
				} 
			} 
		}
		return list; 
	}

}
