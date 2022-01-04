package work9;
import java.util.Scanner;
import javafx.geometry.Point2D;
public class prb09_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter point1's x-,y-coordinates: ");
		double x1=cin.nextDouble();
		double y1=cin.nextDouble();
		System.out.print("Enter point2's x-,y-coordinates: ");
		double x2=cin.nextDouble();
		double y2=cin.nextDouble();
		Point2D p1=new Point2D(x1,y1);
		Point2D p2=new Point2D(x2,y2);
		System.out.println("p1 is "+p1.toString());
		System.out.println("p2 is "+p2.toString());
		System.out.println("the distance between p1 and p2 is "+p1.distance(p2));
	}

}
