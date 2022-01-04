package work2;
import java.util.*;
public class prb02_04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159; 
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a number for radius: "); 
		double radius = input.nextDouble(); 
		double area = radius * radius * PI; 
		System.out.println("The area for thr circle of radius " + radius + " is " + area);
	}

}
