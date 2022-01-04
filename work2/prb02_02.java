package work2;
import java.util.*;
public class prb02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a number for radius: "); 
		double radius = input.nextDouble(); 
		double area = radius * radius * 3.1415; 
		System.out.println("The area for circle of radius " + radius + " is " + area);
	}

}
